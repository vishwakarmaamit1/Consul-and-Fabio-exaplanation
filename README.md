# Consul-and-Fabio-exaplanation
Use below url for referece
http://springconsul.blogspot.com/2017/01/spring-boot-with-consul-and-fabio.html

# Folloe the below step:<br/>
Download the consul and run this command **Consul.exe agent –dev** <br />
Start the address service<br />
Take the host and port number and update in addres provider in the employee service<br />
Now Start the employee service<br />
Now download fabio-1.5.13-go1.13.4-windows_amd64.exe and run<br />
Hit the below url<br />
**http://localhost:8500/ui**<br /> (https://github.com/vishwakarmaamit1/Consul-and-Fabio-exaplanation/blob/master/img/ConsulImg.PNG)
**http://localhost:9998/routes**<br />

# Start your postman
adress url : http://take-hostname-from-consul/address/save<br />
body : {
"houseNumber":11,
"streetRoad":"Outer Ring Road",
"city":"Bangalore",
"pinCode":123456

}<br />
employee url : http://take-hostname-from-consul/employee/save<br />

body:{
"fName":"jhgjh",
"lName":"fsfd",
"id":7

}<br />
Get Emp URL: http://take-hostname-from-consul/employee/7<br />
You will get the employee details with address
