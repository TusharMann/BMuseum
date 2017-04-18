var restful = require('node-restful');
var mongoose = restful.mongoose;

var AllanhillsSchema = new mongoose.Schema({
	result:[{
		language:String,
		key: String,
		image: String,
		context: String
	}]
});
module.exports = restful.model('Allanhills',AllanhillsSchema); 