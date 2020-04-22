1.	Access the Decision Manager - Decision Central workbench at http://localhost:8080/decision-central, and log in with username “rhdmAdmin” and password “xxxxxx”
2.	Use the following repository URL to clone https://github.com/rameshpk/Training.git in your physical directory
3.  Create a new project “Menu -> Design -> Projects”. 
4.	Go to  Click on “Import Assets”
5.	Select “model” and click on “OK” and follow the same approach for other model and drl assets
6.	After the project has been imported you will see assets.
7.	Click on the “Build and Deploy” button to build the KJAR (the Decision Deployment Unit which contains the model and rules) and to deploy it on the execution server.
8.	Once the build and deployment has finished open “Menu -> Deploy -> Execution Servers”. The page will show a running “default-kie-server” with the “decisiontablesample _1.0.0-SNAPSHOT” container.
