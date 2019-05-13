import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountryList {
	

	static List<Country> allCountries = allCountries = Arrays.asList(
			new Country("afghanistan", 20.82, 0, 0.001433, 0.498),
			new Country("albania", 13.04, 0, 0.000276, 0.785),
			new Country("algeria", 170.4, 0, 0.005290, 0.754),
			new Country("andorra", 3.013, 0, 0.000003, 0.858),
			new Country("angola", 124.2, 0, 0.002572, 0.581),
			new Country("antigua", 1.532, 0, 0.000003, 0.780),
			new Country("argentina", 637.6, 0, 0.004721, 0.825),
			new Country("armenia", 11.54, 0, 0.000614, 0.755),
			new Country("australia", 1323, 0, 0.007612, 0.939),
			new Country("austria", 416.6, 0, 0.002979, 0.908),
			new Country("azerbaijan", 40.75, 0, 0.001279, 0.757),
			new Country("bahamas", 12.16, 0, 0.000044, 0.807),
			new Country("bahrain", 35.31, 0, 0.00039, 0.846),
			new Country("bangladesh", 249.7, 0, 0.00806, 0.608),
			new Country("barbados", 4.797, 0, 0.00002, 0.8),
			new Country("belarus", 54.44, 0, 0.002483, 0.808),
			new Country("belgium", 492.7, 0, 0.003858, 0.916),
			new Country("belize", 1.838, 0, 0.000021, 0.708),
			new Country("benin", 9.274, 0, 0.000370, 0.515),
			new Country("bhutan", 2.512, 0, 0.000046, 0.612),
			new Country("bolivia", 37.51, 0, 0.001050, 0.693),
			new Country("bosnia", 18.17, 0, 0.0004, 0.768),
			new Country("botswana", 17.41, 0, 0.000187, 0.717),
			new Country("brazil", 2056, 0, 0.24545, 0.759),
			new Country("brunei", 12.13, 0, 0.00015, 0.853),
			new Country("bulgaria", 56.83, 0, 0.001422, 0.813),
			new Country("burkina faso", 12.87, 0, 0.000659, 0.423),
			new Country("burundi", 3.9, 0, 0.000562, 0.417),
			new Country("cape verde", 1.754, 0, 0.000022, 0.654),
			new Country("cambodia", 22.16, 0, 0.001608, 0.582),
			new Country("cameroon", 34.8, 0, 0.000969, 0.556),
			new Country("canada", 1653, 0, 0.010683, 0.926),
			new Country("central african republic", 1.949, 0, 0.000206, 0.367),
			new Country("chad", 9.981, 0, 0.000568, 0.404),
			new Country("chile", 277.1, 0, 0.003076, 0.843),
			new Country("china", 12240, 280, 0.198566, 0.752),
			new Country("colombia", 309.2, 0, 0.006174, 0.747),
			new Country("comoros", 0.6489, 0, 0.000024, 0.503),
			new Country("democratic republic of the congo", 37.24, 0, 0.004175, 0.457),
			new Country("republic of the congo", 8.723, 0, 0.000361, 0.606),
			new Country("costa rica", 57.06, 0, 0.000240, 0.794),
			new Country("ivory coast", 40.39, 0, 0.001173, 0.492),
			new Country("croatia", 54.85, 0, 0.000580, 0.831),
			new Country("cuba", 87.13, 0, 0.001334, 0.777),
			new Country("curacao", 3, 0, 0.000003, 0.275),
			new Country("cyprus", 21.65, 0, 0.000202, 0.869),
			new Country("czech republic", 215.7, 0, 0.002353, 0.888),
			new Country("denmark", 324.9, 0, 0.001493, 0.929),
			new Country("djibouti", 1.845, 0, 0.000145, 0.476),
			new Country("dominica", 0.5625, 0, 0.000002, 0.715),
			new Country("dominican republic", 75.93, 0, 0.000974, 0.715),
			new Country("timor leste", 2.955, 0, 0.000113, 0.625),
			new Country("ecuador", 103.1, 0, 0.001556, 0.752),
			new Country("egypt", 235.4, 0, 0.009713, 0.696),
			new Country("el salvador", 24.81, 0, 0.000575, 0.674),
			new Country("equatorial guinea", 12.49, 0, 0.000109, 0.591),
			new Country("eritrea", 2.608, 0, 0.002157, 0.440),
			new Country("estonia", 25.92, 0, 0.000253, 0.871),
			new Country("ethiopia", 80.56, 0, 0.003895, 0.463),
			new Country("fiji", 5.061, 0, 0.000081, 0.741),
			new Country("finland", 251.9, 0, 0.002144, 0.920),
			new Country("france", 2583, 300, 0.018924, 0.901),
			new Country("gabon", 14.62, 0, 0.000153, 0.702),
			new Country("gambia", 1.015, 0, 0.000051, 0.460),
			new Country("georgia", 15.16, 0, 0.000504, 0.780),
			new Country("germany", 3677, 0, 0.024082, 0.936),
			new Country("ghana", 47.33, 0, 0.001109, 0.592),
			new Country("greece", 200.3, 0, 0.003813, 0.870),
			new Country("grenada", 1.119, 0, 0.000003, 0.772),
			new Country("guatemala", 75.62, 0, 0.000789, 0.650),
			new Country("guinea", 10.49, 0, 0.000458, 0.459),
			new Country("guinea bissau", 1.347, 0, 0.000132, 0.455),
			new Country("guyana", 3.676, 0, 0.000049, 0.654),
			new Country("haiti", 8.408, 0, 0.000542, 0.498),
			new Country("honduras", 22.98, 0, 0.000454, 0.617),
			new Country("hungary", 139.1, 0, 0.001556, 0.838),
			new Country("iceland", 23.91, 0, 0.000043, 0.935),
			new Country("india", 2597, 135, 0.073444, 0.640),
			new Country("indonesia", 1016, 0, 0.013708, 0.694),
			new Country("iran", 439.5, 0, 0.013450, 0.798),
			new Country("iraq", 197.7, 0, 0.005222, 0.685),
			new Country("ireland", 333.7, 0, 0.000635, 0.938),
			new Country("israel", 350.9, 80, 0.003638, 0.903),
			new Country("italy", 1935, 0, 0.017420, 0.880),
			new Country("jamaica", 14.77, 0, 0.000192, 0.732),
			new Country("japan", 4872, 0, 0.042675, 0.909),
			new Country("jordan", 40.07, 0, 0.001448, 0.735),
			new Country("kazakhstan", 159.4, 0, 0.003233, 0.800),
			new Country("kenya", 74.94, 0, 0.001777, 0.590),
			new Country("kiribati", 0.1962, 0, 0.000002, 0.612),
			new Country("north korea", 12.38, 15, 0.012925, 0.250),
			new Country("south korea", 1531, 0, 0.023878, 0.903),
			new Country("kosovo", 7.129, 0, 0.000002, 0.250),
			new Country("kuwait", 120.1, 0, 0.001352, 0.803),
			new Country("kyrgyzstan", 7.565, 0, 0.000357, 0.672),
			new Country("laos", 16.85, 0, 0.000471, 0.601),
			new Country("latvia", 30.26, 0, 0.000345, 0.847),
			new Country("lebanon", 51.84, 0, 0.000844, 0.757),
			new Country("lesotho", 2.639, 0, 0.000098, 0.520),
			new Country("liberia", 2.158, 0, 0.000223, 0.435),
			new Country("libya", 50.98, 0, 0.001763, 0.706),
			new Country("liechtenstein", 6.289, 0, 0.000002, 0.916),
			new Country("lithuania", 47.17, 0, 0.000442, 0.858),
			new Country("luxembourg", 62.4, 0, 0.000428, 0.904),
			new Country("macedonia", 11.34, 0, 0.000270, 0.757),
			new Country("madagascar", 11.5, 0, 0.000697, 0.519),
			new Country("malawi", 6.303, 0, 0.000527, 0.477),
			new Country("malaysia", 314.5, 0, 0.004403, 0.802),
			new Country("maldives", 4.597, 0, 0.000035, 0.717),
			new Country("mali", 15.29, 0, 0.000516, 0.427),
			new Country("malta", 12.54, 0, 0.000029, 0.878),
			new Country("marshall islands", 0.1994, 0, 0.000001, 0.708),
			new Country("mauritania", 5.025, 0, 0.00290, 0.520),
			new Country("mauritius", 13.34, 0, 0.000062, 0.790),
			new Country("mexico", 1150, 0, 0.12269, 0.774),
			new Country("micronesia", 0.3664, 0, 0.000003, 0.627),
			new Country("moldova", 8.128, 0, 0.000346, 0.700),
			new Country("monaco", 6.075, 0, 0.000003, 0.250),
			new Country("mongolia", 11.49, 0, 0.000249, 0.741),
			new Country("montenegro", 4.774, 0, 0.000133, 0.814),
			new Country("morocco", 109.1, 0, 0.004471, 0.667),
			new Country("mozambique", 12.33, 0, 0.000994, 0.437),
			new Country("myanmar", 69.32, 0, 0.006395, 0.578),
			new Country("namibia", 13.24, 0, 0.000179, 0.647),
			new Country("nauru", 0.1139, 0, 0.000000, 0.250),
			new Country("nepal", 24.47, 0, 0.001437, 0.574),
			new Country("netherlands", 826.2, 0, 0.005646, 0.931),
			new Country("new zealand", 205.9, 0, 0.000771, 0.917),
			new Country("nicaragua", 13.81, 0, 0.000388, 0.658),
			new Country("niger", 8.12, 0, 0.00505, 0.354),
			new Country("nigeria", 375.8, 0, 0.007792, 0.532),
			new Country("norway", 398.8, 0, 0.001640, 0.953),
			new Country("oman", 72.64, 0, 0.001217, 0.821),
			new Country("pakistan", 305, 145, 0.013772, 0.562),
			new Country("palau", 0.2915, 0, 0.000001, 0.798),
			new Country("panama", 61.84, 0, 0.000196, 0.789),
			new Country("papua new guinea", 21.09, 0, 0.000237, 0.544),
			new Country("paraguay", 29.73, 0, 0.000450, 0.702),
			new Country("peru", 211.4, 0, 0.002986, 0.750),
			new Country("philippines", 313.6, 0, 0.005722, 0.699),
			new Country("poland", 524.5, 0, 0.006939, 0.865),
			new Country("portugal", 217.6, 0, 0.001841, 0.847),
			new Country("qatar", 167.6, 0, 0.000884, 0.856),
			new Country("romania", 211.8, 0, 0.003213, 0.811),
			new Country("russia", 1578, 6850, 0.039274, 0.816),
			new Country("rwanda", 9.137, 0, 0.000581, 0.524),
			new Country("saint kitts and nevis", 0.9459, 0, 0.000002, 0.778),
			new Country("saint lucia", 1.712, 0, 0.000005, 0.747),
			new Country("saint vincent and the grenadines", 0.7896, 0, 0.000003, 0.723),
			new Country("noneoa", 0.8566, 0, 0.000005, 0.713),
			new Country("san marino", 1.659, 0, 0.000003, 0.250),
			new Country("sao tome and principe", 0.3909, 0, 0.000006, 0.589),
			new Country("saudi arabia", 683.8, 0, 0.10883, 0.853),
			new Country("senegal", 16.37, 0, 0.000645, 0.505),
			new Country("serbia", 41.43, 0, 0.000951, 0.787),
			new Country("seychelles", 1.486, 0, 0.000004, 0.797),
			new Country("sierra leone", 3.774, 0, 0.000393, 0.419),
			new Country("singapore", 323.9, 0, 0.003226, 0.932),
			new Country("slovakia", 95.77, 0, 0.001420, 0.855),
			new Country("slovenia", 48.77, 0, 0.000346, 0.896),
			new Country("solomon islands", 1.303, 0, 0.000013, 0.546),
			new Country("somalia", 7.369, 0, 0.000531, 0.250),
			new Country("south africa", 349.4, 0, 0.006316, 0.699),
			new Country("spain", 1311, 0, 0.011389, 0.891),
			new Country("sri lanka", 87.17, 0, 0.001932, 0.770),
			new Country("sudan", 117.5, 0, 0.003107, 0.502),
			new Country("south sudan", 2.904, 0, 0.000003, 0.388),
			new Country("suriname", 3.324, 0, 0.000058, 0.720),
			new Country("swaziland", 4.409, 0, 0.000051, 0.588),
			new Country("sweden", 538, 0, 0.002557, 0.933),
			new Country("switzerland", 678.9, 0, 0.001083, 0.944),
			new Country("syria", 59.15, 0, 0.004454, 0.536),
			new Country("taiwan", 474, 0, 0.008010, 0.907),
			new Country("tajikistan", 7.146, 0, 0.000352, 0.650),
			new Country("tanzania", 52.09, 0, 0.002078, 0.538),
			new Country("thailand", 455.2, 0, 0.007973, 0.755),
			new Country("togo", 4.813, 0, 0.000297, 0.503),
			new Country("tonga", 0.4261, 0, 0.000003, 0.726),
			new Country("trinidad and tobago", 22.1, 0, 0.000354, 0.784),
			new Country("tunisia", 40.26, 0, 0.000822, 0.735),
			new Country("turkey", 851.1, 0, 0.014317, 0.791),
			new Country("turkmenistan", 42.36, 0, 0.000711, 0.706),
			new Country("tuvalu", 0.03973, 0, 0.000000, 0.250),
			new Country("uganda", 25.89, 0, 0.001320, 0.516),
			new Country("ukraine", 112.2, 0, 0.011835, 0.751),
			new Country("united arab emirates", 382.6, 0, 0.002980, 0.863),
			new Country("united states", 19390, 6550, 0.142149, 0.924),
			new Country("uruguay", 56.16, 0, 0.000474, 0.804),
			new Country("uzbekistan", 48.72, 0, 0.002256, 0.710),
			new Country("vanuatu", 862.9, 0, 0.000006, 0.603),
			new Country("vatican city", 0.21198, 0, 0.000004, 0.750),
			new Country("venezuela", 482.4, 0, 0.004559, 0.761),
			new Country("vietnam", 223.9, 0, 0.007113, 0.694),
			new Country("yemen", 18.21, 0, 0.001518, 0.452),
			new Country("zambia", 25.81, 0, 0.000749, 0.588),
			new Country("zimbabwe", 17.85, 0, 0.001032, 0.535));
	
	
	
		

//		//all states from the U.S.
//		//double gdp, int nukes, double cinc, double hdi, int natrec, double area, String owner
//		Country Alabama = new State();
//		Country Alaska = new State();
//		Country Arizona = new State();
//		Country Arkansas = new State();
//		Country California = new State();
//		Country Colorado = new State();
//		Country Connecticut = new State();
//		Country Delaware = new State();
//		Country DistrictOfColumbia = new State();
//		Country Florida = new State();
//		Country GeorgiaState = new State();
//		Country Hawaii = new State();
//		Country Idaho = new State();
//		Country Illinois = new State();
//		Country Indiana = new State();
//		Country Iowa = new State();
//		Country Kansas = new State();
//		Country Kentucky = new State();
//		Country Louisiana = new State();
//		Country Maine = new State();
//		Country Maryland = new State();
//		Country Massachusetts = new State();
//		Country Michigan = new State();
//		Country Minnesota = new State();
//		Country Mississippi = new State();
//		Country Missouri = new State();
//		Country Montana = new State();
//		Country Nebraska = new State();
//		Country Nevada = new State();
//		Country NewHampshire = new State();
//		Country NewJersey = new State();
//		Country NewMexico = new State();
//		Country NewYork = new State();
//		Country NorthCarolina = new State();
//		Country NorthDakota = new State();
//		Country Ohio = new State();
//		Country Oklahoma = new State();
//		Country Oregon = new State();
//		Country Pennsylvania = new State();
//		Country RhodeIsland = new State();
//		Country SouthCarolina = new State();
//		Country SouthDakota = new State();
//		Country Tennessee = new State();
//		Country Texas = new State();
//		Country Utah = new State();
//		Country Vermont = new State();
//		Country Virginia = new State();
//		Country Washington = new State();
//		Country WestVirginia = new State();
//		Country Wisconsin = new State();
//		Country Wyoming = new State();
				
}
