<h1 align="center"> #8 </h1>


# SPRING BOOT


<hr>
<h3>FOLDER SRC/MAIN/RESOURCES </h3><br>
<h3>FOULDER STATIC : <b>STYLE.CSS</b> <br> <b>IMG:useful images for the application</b></h3>
<h3>FOLDER TEMPLATES:<br><b>Index.html:Home Page</b><br> <b>assist.html:All-time Serie A assist-man ranking</b>
<br><b>marcatori.html:All time Serie A markers ranking </b> </h3><br>
<hr>
<h3>APPLICATION.PROPERTIES:with this file we configure some important properties of the application, and we also configure a database.</h3><br>
<h3>Let's move to the com.example folder.,<br>
and we start from the main file by defining the app a @SpringBootApplication<b>FootballApplication</b></h3>
<hr>
<h3><b>MODEL</b>Now let's move on to the templates folder, where we define three: Scorers, Assists and Clubs (At the moment we will only use Clubs).
Within the classic Java procedure, we define the variables, getter and setter methods for reading and setting values, we initialize the method and immediately afterwards the constructor with the data assignment inside.</h3><br>
<hr>
<h3><b>REPOSITORY</b>Now for convenience let's start implementing some repositories in a folder called Repository.
Repositories are important elements that help us manipulate database data, mainly with CRUD operations.
With a few lines of code, we create an instance that extends the CrudRepository<>.</h3><br>
  <hr>
<h3><b>SERVICE</b>Now let's move on to the services, where we will create classes where inside we work on various methods that we can apply within the program. Always in the same interfaces folder where we will write only the method without the logic.></h3><br>
  <hr>
<h3><b>CONTROLLER</b>We will have two controllers, a HOME and an ADMIN (which we will not use at the moment), in the home we insert a routing to redirect our page by changing the parameter.<br>
Inside the API folder, we will create controllers that manage the various REST API CRUD calls, creating an API url and assigning it the methods present in the services.<br></h3>
<h2><b>POM.XML: Very important file, which contains the project information plus all the dependencies necessary for operation</b></h2><br>


<hr>
<h1>We generate the project's Jar file for portability, ease of startup and simplified deployment</h2>
<h4>1:Open terminal <br>
2:Install Maven and verify that it works: mvn -v. <br>
3:Move to the root folder and type mvn clean install. <br>
4:Finally in the terminal type java -jar target/Path name<br>

</h4>

Build Commnand : .mvn clean  <br>

Start Command : java -jar nome .jar <br>

