-- 1. Create University table (One side of One-to-Many)
CREATE TABLE IF NOT EXISTS universities (
                                            id SERIAL PRIMARY KEY,
                                            name VARCHAR(255) NOT NULL
    );

-- 2. Create Student table (Center of the model)
CREATE TABLE IF NOT EXISTS students (
                                        id SERIAL PRIMARY KEY,
                                        name VARCHAR(255) NOT NULL,
    age INT,
    university_id INTEGER REFERENCES universities(id) ON DELETE SET NULL
    );

-- 3. Create Student Profile (One-to-One with Student)
CREATE TABLE IF NOT EXISTS student_profiles (
                                                id SERIAL PRIMARY KEY,
                                                bio TEXT,
                                                address VARCHAR(255),
    student_id INTEGER UNIQUE REFERENCES students(id) ON DELETE CASCADE
    );

-- 4. Create Courses table (Part of Many-to-Many)
CREATE TABLE IF NOT EXISTS courses (
                                       id SERIAL PRIMARY KEY,
                                       title VARCHAR(255) NOT NULL
    );

-- 5. Create Join Table for Enrollments (Many-to-Many logic)
CREATE TABLE IF NOT EXISTS enrollments (
                                           student_id INTEGER REFERENCES students(id) ON DELETE CASCADE,
    course_id INTEGER REFERENCES courses(id) ON DELETE CASCADE,
    PRIMARY KEY (student_id, course_id)
    );