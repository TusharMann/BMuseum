var obj1={
	"language":"English",
		"key": "IitbJszd1kM",
		"image": "https://en.wikipedia.org/wiki/Mona_Lisa#/media/File:Mona_Lisa,_by_Leonardo_da_Vinci,_from_C2RMF_retouched.jpg",
	"context":"The Mona Lisa  is a half-length portrait of Lisa Gherardini by the Italian Renaissance artist Leonardo da Vinci, which has been described as the best known, the most visited, the most written about, the most sung about, the most parodied work of art in the world.The painting is a portrait of Lisa Gherardini, the wife of Francesco delGiocondo, and is in oil on a white Lombardy poplar panel, and is believed to have been painted between 1503 and 1506. Leonardo may have continued working on it as late as 1517. It was acquired by King Francis I of France and is now the property of the French Republic, on permanent display at the Louvre Museum in Paris since 1797."
	};

var obj3={
	"language":"French",
		"key": "IitbJszd1kM",
		"image": "https://en.wikipedia.org/wiki/Mona_Lisa#/media/File:Mona_Lisa,_by_Leonardo_da_Vinci,_from_C2RMF_retouched.jpg",
	"context":"Le titre de la peinture, qui est connu en anglais comme Mona Lisa, provient d'une description par l'historien de l'art de la Renaissance Giorgio Vasari, qui a écrit «Leonardo a entrepris de peindre, pour Francesco del Giocondo, le portrait de Mona Lisa, sa femme. Mona en italien est une forme polie d'adresse originale comme ma donna - semblable à Madame, Madame, ou ma dame en anglais. Cela devint madone, et sa contraction mona. Le titre de la peinture, bien que traditionnellement orthographié 'Mona', est également couramment épelé dans l'italien moderne comme Monna Lisa mais ceci est rare en anglais."
		};

  var obj4={
	"language":"German",
		"key": "IitbJszd1kM",
		"image": "https://en.wikipedia.org/wiki/Mona_Lisa#/media/File:Mona_Lisa,_by_Leonardo_da_Vinci,_from_C2RMF_retouched.jpg",
	"context":"Die Mona Lisa ist ein halbes Porträt von Lisa Gherardini von dem italienischen Renaissance-Künstler Leonardo da Vinci, der als die bekanntesten, am meisten besuchten, die am meisten gesprochenen, die am meisten gesungenen, die meisten parodierten Arbeit von Kunst in der Welt.Das Gemälde ist ein Porträt von Lisa Gherardini, die Frau von Francesco del Giocondo, und ist in Öl auf einem weißen Lombardei-Pappel-Panel und wird vermutlich zwischen 1503 und 1506 gemalt worden sein. Leonardo kann weiter daran gearbeitet haben, so spät wie 1517 Es wurde von König Franz I. von Frankreich erworben und ist jetzt Eigentum der Französischen Republik, auf Dauerausstellung im Louvre Museum in Paris seit 1797."
	};

var obj5={
	"language":"Hindi",
		"key": "IitbJszd1kM",
		"image": "https://en.wikipedia.org/wiki/Mona_Lisa#/media/File:Mona_Lisa,_by_Leonardo_da_Vinci,_from_C2RMF_retouched.jpg",
	"context":"मोना लिसा इतालवी पुनर्जागरण कलाकार लियोनार्डो द विंसी द्वारा लिसा गोहरादीनी का आधा-लम्बाई का चित्र है, जिसे 'सबसे प्रसिद्ध, सबसे ज्यादा जाने वाला, सबसे ज्यादा लिखा गया, सबसे ज्यादा गाया जाता है, सबसे अधिक विडंबना वाला काम दुनिया में कला यह पेंटिंग फ्रांसेस्को डेल जियोकोंडो की पत्नी लिसा गोहरादीनी का एक चित्र है, और वह सफेद लोम्बार्डी पॉपल पैनल पर तेल में है और माना जाता है कि वह 1503 और 1506 के बीच चित्रित किया गया था। लियोनार्डो ने 1517 के रूप में देर तक काम करना जारी रखा हो सकता है यह फ्रांस के राजा फ्रांसिस प्रथम द्वारा अधिग्रहण किया गया था और अब फ्रांसीसी गणराज्य की संपत्ति है, 17 9 17 के बाद से पेरिस के लौवर संग्रहालय में स्थायी प्रदर्शन पर।"

	};
	


var obj2={                                        
	"result":[obj1,obj3,obj4,obj5]
};



use appdb;
db.monalisans.insert(obj2);
db.monalisans.find().pretty();