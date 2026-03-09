

# 🧠 Module 4 Knowledge Log: JDBC & SQL Security

## 1. Statement vs. PreparedStatement

During the implementation of the database logic, I explored the differences between the two primary JDBC interfaces for executing SQL.

| Feature | `Statement` | `PreparedStatement` |
| --- | --- | --- |
| **Execution** | Compiled by the database every time it is run. | Pre-compiled once and cached for future use. |
| **Performance** | Slower for repetitive tasks. | Higher performance for repetitive tasks. |
| **Security** | **Vulnerable** to SQL Injection. | **Secure** against SQL Injection. |
| **Parameters** | Uses string concatenation. | Uses `?` placeholders (parameterization). |

---

## 2. SQL Injection: Risks and Prevention

### The Vulnerability (`Statement`)

Using a standard `Statement` with string concatenation is dangerous because user input can be interpreted as SQL commands.

* **Attack Example**: If a user enters `' OR '1'='1` in a search field.
* **Resulting Query**: `SELECT * FROM student WHERE name = '' OR '1'='1';`.
* **Impact**: The database returns all records because `'1'='1'` is always true, bypassing security.

### The Prevention (`PreparedStatement`)

`PreparedStatement` prevents this by separating the SQL command from the user data.

* **Mechanism**: The database treats the input strictly as a **literal value**, not as part of the executable command.
* **Result**: Even if a user inputs attack code, the database simply looks for a name that matches that exact text string, keeping the system safe.

---

## 3. Docker & Infrastructure Knowledge

* **Isolation**: By using Docker, the database runs in a virtualization layer separate from the host OS, ensuring consistent behavior across different environments.
* **Declarative Manifest**: Using Docker Compose allows us to define the entire infrastructure (App, DB, Network, Volumes) in a single file.
* **Persistence**: Configured Docker Volumes ensure that the data stored in `/var/lib/postgresql/data` is kept even if the container is deleted and recreated.

---

