var express = require('express');
var mongoose = require('mongoose');
var bodyparser = require('body-parser');
var url = require('url');

mongoose.connect('mongodb://localhost/appdb');
var app = express();

app.use(bodyparser.urlencoded({extended:true}));
app.use(bodyparser.json());

//Routes
app.use('/api4app',require('./app4api1'));

//Start server 
app.listen(1337,"0.0.0.0",function() {
	console.log('Listening at port 1337');
});
