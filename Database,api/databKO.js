var obj4={    
"result":[                                           //kohinoor
	{
	"language":"English",
		"key": "___nk_OiVSk",
		"image": "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Koh-i-Noor_old_version_copy.jpg/330px-Koh-i-Noor_old_version_copy.jpg",
   "context":"The Koh-i-Noor (Persian for Mountain of Light; also spelled Kohinoor and Koh-i-nur) is a large, colourless diamond that was found near Guntur in Andhra Pradesh, India, possibly in the 13th century. According to legend, it first weighed 793 carats (158.6 g) uncut, although the earliest well-attested weight is 186 carats (37.2 g); it was first owned by the Kakatiya dynasty. The stone changed hands several times between various feuding factions in South Asia over the next few hundred years, before ending up in the possession of Queen Victoria after the British conquest of the Punjab in 1849."
   },
   {
	"language":"French",
		"key": "___nk_OiVSk",
		"image": "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Koh-i-Noor_old_version_copy.jpg/330px-Koh-i-Noor_old_version_copy.jpg",
  // "context":"The Koh-i-Noor (Persian for Mountain of Light; also spelled Kohinoor and Koh-i-nur) is a large, colourless diamond that was found near Guntur in Andhra Pradesh, India, possibly in the 13th century. According to legend, it first weighed 793 carats (158.6 g) uncut, although the earliest well-attested weight is 186 carats (37.2 g); it was first owned by the Kakatiya dynasty. The stone changed hands several times between various feuding factions in South Asia over the next few hundred years, before ending up in the possession of Queen Victoria after the British conquest of the Punjab in 1849."
   "context":"Le Koh-i-Noor est un grand diamant incolore qui a été trouvé près de Guntur dans l'Andhra Pradesh, en Inde, peut-être au 13ème siècle. Selon la légende, il a d'abord pesé 793 carats (158,6 g) non coupé, bien que le premier bien attesté poids est de 186 carats (37,2 g); Il a d'abord appartenu à la dynastie Kakatiya. La pierre a changé de mains plusieurs fois entre les différentes factions en Asie du Sud au cours des cent prochaines années, avant de se retrouver dans la possession de la reine Victoria après la conquête britannique du Punjab en 1849."
   },
   {
	"language":"German",
		"key": "___nk_OiVSk",
		"image": "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Koh-i-Noor_old_version_copy.jpg/330px-Koh-i-Noor_old_version_copy.jpg",
  "context":"Der Koh-i-Noor (Perser für den Berg des Lichts, auch Bohinoor und Koh-i-nur geschrieben) ist ein großer, farbloser Diamant, der in der Nähe von Guntur in Andhra Pradesh, Indien, vielleicht im 13. Jahrhundert gefunden wurde. Nach der Legende wog sie zuerst 793 Karat (158,6 g) ungeschnitten, obwohl das früheste gut bezeugte Gewicht 186 Karat (37,2 g) ist; Es war zuerst im Besitz der Kakatiya-Dynastie. Der Stein wechselte mehrere Male zwischen den verschiedenen Fehdenfraktionen in Südasien in den nächsten hundert Jahren, bevor er im Jahre 1849 nach der britischen Eroberung des Punjab im Besitz der Königin Victoria stand."
  },
   {
	"language":"Hindi",
		"key": "___nk_OiVSk",
		"image": "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Koh-i-Noor_old_version_copy.jpg/330px-Koh-i-Noor_old_version_copy.jpg",
  //"context":"Der Koh-i-Noor (Perser für den Berg des Lichts, auch Bohinoor und Koh-i-nur geschrieben) ist ein großer, farbloser Diamant, der in der Nähe von Guntur in Andhra Pradesh, Indien, vielleicht im 13. Jahrhundert gefunden wurde. Nach der Legende wog sie zuerst 793 Karat (158,6 g) ungeschnitten, obwohl das früheste gut bezeugte Gewicht 186 Karat (37,2 g) ist; Es war zuerst im Besitz der Kakatiya-Dynastie. Der Stein wechselte mehrere Male zwischen den verschiedenen Fehdenfraktionen in Südasien in den nächsten hundert Jahren, bevor er im Jahre 1849 nach der britischen Eroberung des Punjab im Besitz der Königin Victoria stand."
  "context":"कोह-ई-नूर (लाइट के माउंटेन ऑफ फ़ारसी, कोहिनूर और कोह-ए-नूर की वर्तनी) एक विशाल, रंगहीन हीरा है जो आंध्र प्रदेश के गुंटूर के पास पाया गया था, संभवत: 13 वीं शताब्दी में। पौराणिक कथा के अनुसार, यह पहली बार 793 कैरेट (158.6 ग्राम) काटा हुआ था, हालांकि सबसे पहले वांछित वजन 186 कैरेट (37.2 ग्राम) है; यह पहली बार काकातिया वंश का स्वामित्व था 1849 में पंजाब को ब्रिटिश विजय के बाद रानी विक्टोरिया के कब्जे में समाप्त होने से पहले, अगले कुछ सौ साल में दक्षिण एशिया में विभिन्न झगड़े गुटों के बीच पत्थर ने कई बार हाथ बदल दिया।"
  }]
};
use appdb;
db.kohinoorms.insert(obj4);
db.kohinoorms.find().pretty();
