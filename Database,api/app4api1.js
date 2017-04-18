var express = require('express');
var router  =express.Router();


var Monalisa=require('./monalisa1');
Monalisa.methods(['get','put','post','delete']);

Monalisa.register(router,'/Monalisa');



var Allanhills=require('./Allanhills');
Allanhills.methods(['get','put','post','delete']);

Allanhills.register(router,'/Allanhills');


var Kohinoor=require('./Kohinoor');
Kohinoor.methods(['get','put','post','delete']);

Kohinoor.register(router,'/Kohinoor');


var Thethinker=require('./Thethinker');
Thethinker.methods(['get','put','post','delete']);

Monalisa.register(router,'/Thethinker');




module.exports=router;