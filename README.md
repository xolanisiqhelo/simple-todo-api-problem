# Simple Todo - API
A simple todo api problem to be used as a technical test.

## The problem
Build a REST API backend service that exposes a few services that can be used as a TODO application. The minimum application should expose the services specified in the [specification.yml](specification.yml) and function as detailed below. The application does not need a database or persistent storage, and can use in-memory storage for the duration of its runtime.

## How to get started
* Open the [specification.yml](specification.yml) file and copy the contents into [editor.swagger.io](https://editor.swagger.io/) to view it easily.
* Make sure each api route implements the functional requirements mentioned below.

## Functional requirements
* None of the API routes require any kind of authentication or authorization.
* All todos should be stored in application memory and no persistent storage is required.
* When the application starts up, one default todo should exist with the name `Do some work` in an uncompleted state.
* The update todo service, should update the entire todo object except for the id.
* If a todo is added with the name `I'm lazy`, an error should be thrown.

## Technical requirements
* The application source code must be versioned using a public git repository on either Github, GitLab or Bitbucket.
* The application repository should contain a readme.md file containing the below.
  * A description of the application as you understand it.
  * How to build and run the code locally.
  * Any design choices or dependencies you chose to use.
* The application should be exposed on localhost and port 8080.

## Tips
* Use small and focussed commits in your git repo. After each self-contained change ensure you commit the change.
* Consider using test driven development.
* Consider using semantic commits to help categorise your changes.
* Remove any compiler or runtime warnings.
* Remove unneeded comments.
* Apply a code style format.
