var obj3= {                                              //allan hills
	"result":[{
	"language":"English",
		"key": "f0EZKKjyJgs",
		"image": "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/ALH84001.jpg/330px-ALH84001.jpg",
    "context":"Allan Hills 84001 (commonly abbreviated ALH84001) is a meteorite that was found in Allan Hills, Antarctica on December 27, 1984 by a team of U.S. meteorite hunters from the ANSMET project. Like other members of the group of SNCs (shergottite, nakhlite, chassignite), ALH84001 is thought to be from Mars. However, it does not fit into any of the previously discovered SNC groups. On discovery, its mass was 1.93 kilograms (4.3 lb)."
	},
	{
	"language":"French",
		"key": "f0EZKKjyJgs",
		"image": "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/ALH84001.jpg/330px-ALH84001.jpg","context":"Allan Hills 84001 (généralement abrégé ALH84001) est une météorite qui a été trouvée à Allan Hills, en Antarctique le 27 décembre 1984 par une équipe de chasseurs de météorites américains du projet ANSMET. Comme d'autres membres du groupe des SNC (shergottite, nakhlite, chassignite), ALH84001 est pensé pour être de Mars. Cependant, il ne rentre dans aucun des groupes SNC précédemment découverts. À la découverte, sa masse était de 1,93 kilogrammes (4,3 lb)."
	},
	{
	"language":"German",
		"key": "f0EZKKjyJgs",
		"image": "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/ALH84001.jpg/330px-ALH84001.jpg",	
		"context":"Allan Hills 84001 (gemeinhin abgekürzt ALH84001) ist ein Meteorit, der in Allan Hills, Antarktis am 27. Dezember 1984 von einem Team von U.S. Meteoritenjägern aus dem ANSMET-Projekt gefunden wurde. Wie andere Mitglieder der Gruppe der SNCs (Shergottit, Nakhlit, Chassignit), wird ALH84001 von Mars gehalten. Allerdings passt es nicht in eine der zuvor entdeckten SNC-Gruppen. Bei der Entdeckung war seine Masse 1,93 Kilogramm (4,3 Pfund)."
	},
	{
	"language":"Hindi",
		"key": "f0EZKKjyJgs",
		"image": "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/ALH84001.jpg/330px-ALH84001.jpg",
		"context":"एलन हिल्स 84001 (आमतौर पर संक्षिप्त ALH84001) एक उल्का है जो एलएन हिल्स, अंटार्कटिका में 27 दिसंबर 1984 को एएनएसएमईटी परियोजना से अमेरिकी उल्काहारी शिकारी की एक टीम द्वारा पाया गया था। एसएनसी (शेरगोट्टी, नखलाईट, चेसिग्नाइट) के समूह के अन्य सदस्यों की तरह, ALH84001 मंगल ग्रह से माना जाता है। हालांकि, यह पहले से पता चला एसएनसी समूहों में से किसी में फिट नहीं है खोज पर, इसका द्रव्यमान 1.93 किलोग्राम (4.3 एलबी) था।"
	}]
};
use appdb;
db.allanhills.insert(obj3);
db.allanhills.find().pretty();
