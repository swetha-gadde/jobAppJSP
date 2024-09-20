
# Job Portal Web App

This is a full-stack Spring MVC project using JSP for views, Spring Boot for the backend, and Lombok to reduce boilerplate code. This application allows recruiters to post jobs and job seekers to view them.

## Prerequisites

Before you begin, ensure you have the following software installed:

### Install Git

1. Download and install Git from [Git Downloads](https://git-scm.com/downloads).
2. Verify installation:

   ```bash
   git --version
   ```

### Install Java

1. Download and install Java JDK from [Oracle Downloads](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Set up Java environment variables (for Windows users):
   - Add `JAVA_HOME` and update the `PATH` variable in system variables.
3. Verify installation:

   ```bash
   java -version
   ```

### Install IntelliJ IDEA

1. Download and install IntelliJ IDEA from [JetBrains Downloads](https://www.jetbrains.com/idea/download/).
2. After installing, open IntelliJ IDEA, and configure the JDK path by following [this guide](https://www.jetbrains.com/help/idea/sdk.html).

## Project Setup

1. **Clone the repository using Git:**

   ```bash
   git clone < https://github.com/swetha-gadde/jobAppJSP.git >
   ```

2. **Navigate to the project directory:**

   ```bash
   cd <jobAppTelusko>
   ```

3. **Open the project in IntelliJ IDEA.**

4. **Install Lombok plugin in IntelliJ IDEA:**

   - You can add the dependancy in `pom.xml` file.

5. **Build the project:**

   - Go to `Build > Build Project` in IntelliJ IDEA.

6. **Configure application properties (if necessary):**

   - Open `src/main/resources/application.properties`.
   - Ensure the server port is set:

     ```properties
     server.port=8080
     ```

7. **Run the application:**

   - Use the IntelliJ run button.
   - Or run the command:

     ```bash
     mvn spring-boot:run
     ```

## Application Pages

### 1. Homepage

- **URL:** `http://localhost:8080/` or `http://localhost:8080/home`
- The homepage allows users to either view all jobs or add new job postings.


### 2. View All Jobs (Job Seeker)

- **URL:** `http://localhost:8080/viewjobs`
- Job seekers can view a list of all posted jobs.

 

### 3. Add Job (Recruiter)

- **URL:** `http://localhost:8080/addjob`
- Recruiters can add a new job post with details like Job ID, Profile, Description, Experience required, and Tech Stack.


### 4. Job Added (Success Page)

- After a job is added successfully, the system will display a success page confirming the new job post.

  
## Project Dependencies

This project was created using Spring Initializer with the following dependencies:

- **Spring Web:** For building web applications.
- **Lombok:** To reduce boilerplate code for model classes.

## Running the Application

1. **Navigate to the project root.**

2. **Run the Spring Boot application:**

   ```bash
   mvn spring-boot:run
   ```

3. **Access the application:**

   - Open a web browser and go to `http://localhost:8080/`.

## Additional Information

- **Database Configuration:**
  - If your application uses a database, ensure the database is up and running.
  - Update `application.properties` with your database configurations.

- **Logging:**
  - Logs are configured in `application.properties`.
  - You can change the logging level if needed.


