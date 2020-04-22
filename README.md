1.	Access the Decision Manager - Decision Central workbench at http://localhost:8080/decision-central, and log in with username “rhdmAdmin” and password “xxxxxx”
2.	Use the following repository URL to clone https://github.com/rameshpk/Training.git in your physical directory
3.  Create a new project “Menu -> Design -> Projects”. 
4.	Go to  Click on “Import Assets”
5.	Select “model/Asset” from your physical drive and the click on “OK” and follow the same approach for other model and drl assets
6.	After the project has been imported you will see assets.
7.	Click on the “Build and Deploy” button to build the KJAR (the Decision Deployment Unit which contains the model and rules) and to deploy it on the execution server.
8.	Once the build and deployment has finished open “Menu -> Deploy -> Execution Servers”. The page will show a running “default-kie-server” with the “decisiontablesample _1.0.0-SNAPSHOT” container.

Test Your BRMS Service

The Decision Server comes with a Swagger UI that allows us to test the RESTful endpoints of the server and the rules deployed on it. We will use this UI to test our rules.

Go to the URL”http://localhost:8080/kie-server/docs”. This will open the Swagger UI.
Send a request to the Decsion Service by navigating to “Rules evaluation :: BRM” : “POST” : “/server/containers/instances/{id}.
Set “Parameter content type” to “application/json”,  set “id” to “xxxxxx_1.0.0-SNAPSHOT” (this is the id of the Rules container), set “body” to:.(JSON Paylaod)

Set “Response content type” to “application/json”
Click on execute.
The page will show a response with code “200” and a response body that lists the result of the rule execution. Especially, which is the outcome of the rule evaluation.
