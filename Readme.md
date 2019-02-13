This project is a contact management API and support the full CRUD operations.
Docker container for Spring and MySQL are on developement process. 

## Dependency/Tools
* JDK 1.8 or later
* Maven 3.2+
* Docker
* MySQL

## Frameworks
* Spring boot 1.5.6.RELEASE


## Compile/Run 
_**Spring**_

## URL Mapping
* **/** root url - show plain welcome message
* **/address/** - show all available addresses with Complete CRUD
    1. **/view/?id={number}** - Uses GET verb and shows address if available
    1. **/add/** - Uses POST verb and accepts json as body param. JSON should follow {"identificationid":number, "type":"String", "number":int, "street":"String", "unit":"String", "city":"String", "state":"String", "zip":"String"}
    1. **/update/?id={number}** = Uses PUT and accepts json as body param and id as Request Param.
    1. **/delete/?id={number}** - Uses DELETE verb and accepts the id of record to be deleted.
* **/communication/** - shows all available communication
    1. **/communication/?id={number}** - Uses GET verb and shows communication if available
    1. **/add/** - Uses POST verb and accepts json as body param. JSON should follow {"identificationid":number, "type":"String",  "value":"String", "preferred":"String"}
    1. **/update/?id={number}** = Uses PUT and accepts json as body param and id as Request Param.
    1. **/delete/?id={number}** - Uses DELETE verb and accepts the id of record to be deleted.
* **/identification/** = shows all available identification of person
    1. **/communication/?id={number}** - Uses GET verb and shows identity if available
    1. **/add/** - Uses POST verb and accepts json as body param. JSON should follow {"firstname":"String", "lastname":"String",  "gender":"String", "title":"String", "dob":date}
    1. **/update/?id={number}** = Uses PUT and accepts json as body param and id as Request Param.
    1. **/delete/?id={number}** - Uses DELETE verb and accepts the id of record to be deleted.
* **/person/** = shows all record in its proper cascading of JSON object
    1. **/?id={number}** - Uses GET verb and shows single person if available
