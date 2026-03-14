INSERT INTO universities (name) VALUES ('BIT M'), ('MNIT');
INSERT INTO students (name, age, university_id) VALUES ('Sanjay', 22, 1),
                                ('Anjali', 21, 2);
INSERT INTO student_profiles (bio, student_id) VALUES ('Java Dev', 1);
INSERT INTO courses (title) VALUES ('Docker Mastery'), ('Spring Boot');
INSERT INTO enrollments (student_id, course_id) VALUES (1, 1), (1, 2);