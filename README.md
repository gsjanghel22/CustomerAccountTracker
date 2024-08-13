<h1> # CustomerAccountTracker </h1>
      <br>
<h2>AICP Bank - A Leading private bank looking for solution to track customers and their account details.</h2>
<br>
<p>
  <h4>Requirement Specifications of the Project</h4>
  1. Able to create new account for a customer (only one account type / customer)
  <br>
  2. Able to edit customer personal details.
  <br>
  3. Able to fetch one or more customer personal details including account details too.
  <br>
  4. Customers can transfer funds from one account to another account. If enough fund exists.
</p>
<br>
<p>
  <h3>Steps Followed in the Project Development</h3>
  <h4>Setup Development Environment</h4>
  1. Git Version 2+
  <br>
  2. OpenJDK Version 8+
  <br>
  3. Maven Version 3+
  <br>
  4. Spring Tool Suite
  <br>
  5. MySQL Workbench Version 8.0.CE+
</p>
<p>
  <h4>Getting started with Creating Spring Boot Application</h4>
  1. Configure pom.xml with all required dependencies.
  <br>
  2. Configure application.properties (server port, DB details, logging and any other).
  <br>
  3. Configure application-integrationtest.properties ( for testing).
  </p>
  <p>
    <h4>Built the solution with suitable design</h4>
    1. Identify Model(s) and configure attributes with JPA.
    <br>
    2. Create Repository interface and test sample CRUD operations for identified Model(s).
    <ul>
      <li>Test for Empty records</li>
      <li>Test for saving</li>
      <li>Test for findAll</li>
      <li>Test for findById</li>
      <li>Test for findBy(AnyField)</li>
      <li>Test for deleteById</li>
      <li>Test for deleteAll</li>
      <li>Test for update (using serialized field)</li>
      <li>Test for update (using non-serialized field)</li>
    </ul>
    Note: if required append/define customized method with Query
    <br>
    <br>
    3. Create <b>@RestController</b> and test for all identified end points.
    <ul>
      <li>Create methods for all identified end points</li>
      <li>Test all end points with hard coded Response body</li>
      <li>Test for GetMapping:<br>
      a)For String<br>
      b)Object<br>
      c)List<br>
      d)ResponseEntity(HttpStatus)</li>
      <li>Test for PostMapping</li>
      <li>Test for PutMapping</li>
      <li>Test for DeleteMapping</li>
    </ul>
    <br>
    4. Create <b>@Service</b> and test for all identified business requirements.
    <ul>
      <li>Create interface and declare all required methods</li>
      <li>Implement a class with business logic</li>
      <li>Test for identified services</li>
    </ul>
    <br>
    5. Integrate <b>@RestController</b>, <b>@Service</b> and <b>@Repository</b>.
    <ul>
      <li>Replace hardcoded data in <b>@RestController</b> with service(s) execution</li>
      <li>Re-Test your end point execution</li>
      <li>Run the application:<br>
      a)Test with Postman<br>
      b)Rest client (optional)<br> 
      c)UI... (optional)</li>
      <li>Build package with maven:<br>
      a)Check/review your test log<br> 
      b)Run jar file and validate completeness & correctness of solution</li>
    </ul>
  </p>
