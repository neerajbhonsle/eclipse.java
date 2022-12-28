package com.xworkz.Collection.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dams {

	public static void main(String[] args) {
		Collection<String> damsInKaranataka = new ArrayList<String>();
		damsInKaranataka.add("KRS");
		damsInKaranataka.add("BRP");
		damsInKaranataka.add("TB");
		damsInKaranataka.add("Gajanur");
		damsInKaranataka.add("Liganamati");
		damsInKaranataka.add("Almatti Dam");
		damsInKaranataka.add("Basava Sagara Dam");
		damsInKaranataka.add("Raja Lakhamagowda dam");
		damsInKaranataka.add("Renuka Sagara Dam");
		damsInKaranataka.add("Vani Vilasa Sagara");
		damsInKaranataka.add("Hemavathi Reservoir");
		damsInKaranataka.add("Masonry dam");
		damsInKaranataka.add("Harangi Reservoir");
		damsInKaranataka.add("Linganamakki Dam");
		damsInKaranataka.add("Supa Dam");
		damsInKaranataka.add("Kodasalli Dam");
		damsInKaranataka.add("Kadra Dam");
		System.out.println("Names of dams in karanataka is: " + damsInKaranataka);
		System.out.println("total: " + damsInKaranataka.size());
		Iterator<String> dam = damsInKaranataka.iterator();
		while (dam.hasNext()) {
			String element = dam.next();

			if (element.startsWith("T"))
				System.out.println("element start with T: " + element);
		}
		Iterator<String> kar = damsInKaranataka.iterator();
		while (kar.hasNext()) {
			String element = kar.next();
			if (element.endsWith("Ra"))
				System.out.println("element ends with Ra: " + element);
		}
		Iterator<String> kar1 = damsInKaranataka.iterator();
		while (kar1.hasNext()) {
			String element = kar1.next();
			if (element.length() >= 15) {
				System.out.println("element length is over 15 char : " + element);
			}
		}
		Iterator<String> kar2 = damsInKaranataka.iterator();
		while (kar2.hasNext()) {
			String element = kar2.next();
			if (element.toUpperCase() != null) {
				System.out.println("dam in uppercase : " + element);
			}
		}
		Iterator<String> kar3 = damsInKaranataka.iterator();
		while (kar3.hasNext()) {
			String element = kar3.next();
			if (element.toLowerCase() != null) {
				System.out.println("dam in lowercase : " + element);
			}
		}

		System.out.println("******************************************************************");

		Collection<String> damsInKerala = new ArrayList<String>();
		damsInKerala.add("Malampuzha Dam");
		damsInKerala.add("Mangalam Dam");
		damsInKerala.add("Meenkara Dam");
		damsInKerala.add("Chulliar Dam");
		damsInKerala.add("Pothundi Dam");
		damsInKerala.add("Walayar Dam");
		damsInKerala.add("Siruvani Dam");
		damsInKerala.add("Kanjirapuzha dam");
		damsInKerala.add("Kanjhirapuzha baby Dam");
		damsInKerala.add("Parambikulam");
		damsInKerala.add("Thunakkadavu Dam");
		damsInKerala.add("Peruvaaripallam Dam");
		damsInKerala.add("Sholayar Dam");
		damsInKerala.add("Peringalkuthu Dam");
		damsInKerala.add("Thenmala Dam");
		damsInKerala.add("Aruvikkara Dam");
		damsInKerala.add("Vazhani Dam");
		damsInKerala.add("Kuttiady Dam");
		damsInKerala.add("Neyyar Dam");
		damsInKerala.add("Pamba Dam");
		damsInKerala.add("Kakki Dam");
		damsInKerala.add("Idukki Dam");
		damsInKerala.add("Ponmudi Dam");
		damsInKerala.add("Anayirankal Dam");
		damsInKerala.add("Mattupatti Dam");
		damsInKerala.add("Sengulam dam");
		damsInKerala.add("Neriamangalam baby Dam");
		damsInKerala.add("Bhoothathankettu");
		damsInKerala.add("Periyar Dam");
		damsInKerala.add("Pazhassi Dam");
		damsInKerala.add("Peppara Dam");
		damsInKerala.add("Malankara Dam");
		damsInKerala.add("Chimmony Dam");
		damsInKerala.add("Banasura Sagar Dam");
		damsInKerala.add("Karapuzha Dam");
		damsInKerala.add("Mullaperiyar Dam");
		damsInKerala.add("Cheruthoni Dam");
		damsInKerala.add("Kulamavu Dam");
		damsInKerala.add("Erattayar Dam");
		damsInKerala.add("Kakkayam Dam");
		damsInKerala.add("Asurankund Dam");
		damsInKerala.add("Maniyar Dam	Kakkattar River");
		damsInKerala.add("Moozhiyar Dam");
		damsInKerala.add("Karikkayam Dam");
		damsInKerala.add("Allunkal Dam");
		damsInKerala.add("	Kochu Pamba Weir	Pamba River");
		damsInKerala.add("Anathode Dam");
		damsInKerala.add("Veluthodu Dam");
		damsInKerala.add("Idamalayar Dam");
		damsInKerala.add("Kallarkutty Dam");
		damsInKerala.add("Pambla Dam");
		damsInKerala.add("Munnar Headworks Dam");
		damsInKerala.add("Moolathara Dam");
		damsInKerala.add("Thunakkadavu Dam");
		damsInKerala.add("Peruvaripallam Dam");

		System.out.println("Names of dams in kerala is: " + damsInKerala);
		System.out.println("total: " + damsInKerala.size());

		Iterator<String> kel = damsInKerala.iterator();
		while (kel.hasNext()) {
			String element = kel.next();

			if (element.startsWith("T"))
				System.out.println("element start with T: " + element);
		}
		Iterator<String> kelra = damsInKerala.iterator();
		while (kelra.hasNext()) {
			String element = kelra.next();
			if (element.endsWith("Ra"))
				System.out.println("element ends with Ra: " + element);
		}
		System.out.println("******************************************************************");

		Collection<String> damsInHimachalPradesh = new ArrayList<String>();
		damsInHimachalPradesh.add("Baira Siul Dam");
		damsInHimachalPradesh.add("Bassi Dam");
		damsInHimachalPradesh.add("Bhakra Dam");
		damsInHimachalPradesh.add("Chamera I Dam");
		damsInHimachalPradesh.add("Chamera II Dam");
		damsInHimachalPradesh.add("Chamera III Dam");
		damsInHimachalPradesh.add("Karchham-Wangtoo Dam");
		damsInHimachalPradesh.add("Kol dam");
		damsInHimachalPradesh.add("Largia Dam");
		damsInHimachalPradesh.add("Malana I ");
		damsInHimachalPradesh.add("Nathpa Jhakri (Sjvnl) Dam");
		damsInHimachalPradesh.add("Pandoh dam");
		damsInHimachalPradesh.add("Parbati - III Dam");
		damsInHimachalPradesh.add("Parbati II Dam");
		damsInHimachalPradesh.add("Pong Dam");
		damsInHimachalPradesh.add("Sawra Dam");
		System.out.println("Names of dams in HimachalPradesh is: " + damsInHimachalPradesh);
		System.out.println("total: " + damsInHimachalPradesh.size());

		Iterator<String> hm = damsInHimachalPradesh.iterator();
		while (hm.hasNext()) {
			String element = hm.next();

			if (element.startsWith("T"))
				System.out.println("element start with T: " + element);
		}
		Iterator<String> hmp = damsInHimachalPradesh.iterator();
		while (hmp.hasNext()) {
			String element = hmp.next();
			if (element.endsWith("Ra"))
				System.out.println("element ends with Ra: " + element);
		}

		System.out.println("******************************************************************");

		Collection<String> damsInAndraPradesh = new ArrayList<String>();
		damsInAndraPradesh.add("Nagarjuna Sagar Dam");
		damsInAndraPradesh.add("Somasila Dam");
		damsInAndraPradesh.add("Nallamalasagar Reservoir");
		damsInAndraPradesh.add("Jalaput Dam");
		damsInAndraPradesh.add("Kalyani Dam");
		damsInAndraPradesh.add("Brahmamsagar Reservoir Dam");
		damsInAndraPradesh.add("Velugodu Balancing Reservoir");
		damsInAndraPradesh.add("PABR dam");
		damsInAndraPradesh.add("Chitravathi Balancing Reservoir");
		damsInAndraPradesh.add("Mylavaram");
		damsInAndraPradesh.add("Mid Pennar Dam");
		damsInAndraPradesh.add("Veligallu Dam");
		damsInAndraPradesh.add("Rajolibanda");
		damsInAndraPradesh.add("Tatipudi Reservoir");
		damsInAndraPradesh.add("Sanjeevaiah Sagar Dam");
		damsInAndraPradesh.add("Gollapalli Reservoir Dam");
		System.out.println("Names of dams in AP is: " + damsInAndraPradesh);
		System.out.println("total: " + damsInAndraPradesh.size());

		Iterator<String> ap = damsInAndraPradesh.iterator();
		while (ap.hasNext()) {
			String element = ap.next();

			if (element.startsWith("T"))
				System.out.println("element start with T: " + element);
		}
		Iterator<String> ap1 = damsInAndraPradesh.iterator();
		while (ap1.hasNext()) {
			String element = ap1.next();
			if (element.endsWith("Ra"))
				System.out.println("element ends with Ra: " + element);
		}

		System.out.println("******************************************************************");

		Collection<String> damsInTamilNadu = new ArrayList<String>();
		damsInTamilNadu.add("Aanaimaduvu Dam");
		damsInTamilNadu.add("Adavinainarkovil Dam");
		damsInTamilNadu.add("Aliyar Reservoir");
		damsInTamilNadu.add("Amaravathi Dam");
		damsInTamilNadu.add("Anaikuttam Dam");
		damsInTamilNadu.add("Andiappanur Odai Dam");
		damsInTamilNadu.add("Avalanche Dam");
		damsInTamilNadu.add("PABR dam");
		damsInTamilNadu.add("Chitravathi Balancing Reservoir");
		damsInTamilNadu.add("Mylavaram");
		damsInTamilNadu.add("Mid Pennar Dam");
		damsInTamilNadu.add("Berijam Lake Dam");
		damsInTamilNadu.add("Rajolibanda");
		damsInTamilNadu.add("Tatipudi Reservoir");
		damsInTamilNadu.add("Barur Dam");
		damsInTamilNadu.add("Bungihalla Bund Dam");
		System.out.println("Names of dams in TN is: " + damsInTamilNadu);
		System.out.println("total: " + damsInTamilNadu.size());

		Iterator<String> tn = damsInKaranataka.iterator();
		while (tn.hasNext()) {
			String element = tn.next();

			if (element.startsWith("T"))
				System.out.println("element start with T: " + element);
		}
		Iterator<String> tn1 = damsInKaranataka.iterator();
		while (tn1.hasNext()) {
			String element = tn1.next();
			if (element.endsWith("Ra"))
				System.out.println("element ends with Ra: " + element);
		}

		System.out.println("******************************************************************");

		Collection<String> damsInTelangana = new ArrayList<String>();
		damsInTelangana.add("Devadula	Devadula");
		damsInTelangana.add("Kalwakurthy Kalwakurthy Dam");
		damsInTelangana.add("Kalwakurthy - Stage II	");
		damsInTelangana.add("Kalwakurthy - Stage III  Dam");
		damsInTelangana.add("Bhima	Bhima Stage I Dam");
		damsInTelangana.add("Bhima Stage II Dam");
		damsInTelangana.add("Nettempadu	Nettempadu Stage I");
		damsInTelangana.add("PABR dam");
		damsInTelangana.add("Kaleshwaram Reservoir");
		damsInTelangana.add("Alisagar");
		damsInTelangana.add("Udaya Samudram Dam");

		System.out.println("Names of dams in Telangana is: " + damsInTelangana);
		System.out.println("total: " + damsInTelangana.size());
		System.out.println("******************************************************************");

		Collection<String> damsInMH = new ArrayList<String>();
		damsInMH.add(" Koyna  Dam");
		damsInMH.add("Mula Dam");
		damsInMH.add("Mulshi dam");
		damsInMH.add("Ujjani Dam");
		damsInMH.add("Kalyani Dam");
		damsInMH.add("Jayakwadi Dam");

		System.out.println("Names of dams in MH is: " + damsInMH);
		System.out.println("total: " + damsInMH.size());
		System.out.println("******************************************************************");

		Collection<String> damsInRajasthan = new ArrayList();
		damsInRajasthan.add("RanapratapSagar Dam");
		damsInRajasthan.add("Mahi Bajaj Sagar Dam");
		damsInRajasthan.add("Bisalpur Dam ");
		System.out.println("The Num of Dam in Rajasatan:-" + damsInRajasthan.size() + "_" + damsInRajasthan);
		System.out.println("******************************************************************");

		Collection<String> damsInArunachalPradesh = new ArrayList();
		damsInArunachalPradesh.add("Ranganadi Dam");
		damsInArunachalPradesh.add("Dibang");
		System.out.println("******************************************************************");

		Collection<String> damsInBihar = new ArrayList();
		damsInBihar.add("Kohira Dam");
		damsInBihar.add("Nagi Dam");
		System.out.println("The Num of Dam in Bihar:-" + damsInBihar.size() + "_" + damsInBihar);
		System.out.println("******************************************************************");

		Collection<String> damsInChhattisgarh = new ArrayList();
		damsInChhattisgarh.add("HasdeoBango Dam");
		System.out.println("The Num of Dam in Chhattisgarh:-" + damsInChhattisgarh.size() + "_" + damsInChhattisgarh);
		System.out.println("******************************************************************");

		Collection<String> damsInGujarat = new ArrayList();
		damsInGujarat.add("SardarSarovar Dam");
		damsInGujarat.add("Ukai Dam");
		damsInGujarat.add("Kadana Dam");
		damsInGujarat.add("Karjan Reservoir");
		System.out.println("The Num of Dam in Gujarat:-" + damsInGujarat.size() + "_" + damsInGujarat);
		System.out.println("******************************************************************");

		Collection<String> damsInJandK = new ArrayList();
		damsInJandK.add("Salal Dam");
		damsInJandK.add("Baglihar Dam");
		System.out.println("The Num of Dam in Jammu And Kashmir:-" + damsInJandK.size() + "_" + damsInJandK);
		System.out.println("******************************************************************");

		Collection<String> damsInJharkhand = new ArrayList();
		damsInJharkhand.add("The Maithon Dam");
		damsInJharkhand.add("Panchet Dam");
		damsInJharkhand.add("Tenughat Dam ");
		System.out.println("The Num of Dam in Jarkhand:-" + damsInJharkhand.size() + "_" + damsInJharkhand);
		System.out.println("******************************************************************");

		Collection<String> damsInMadhyaPradesh = new ArrayList();
		damsInMadhyaPradesh.add("Gandhi Sagar Dam");
		damsInMadhyaPradesh.add("Tawa Reservoir");
		damsInMadhyaPradesh.add("Indira Sagar Dam");
		System.out.println("The Num of Dam in MP:-" + damsInMadhyaPradesh.size() + "_" + damsInMadhyaPradesh);
		System.out.println("******************************************************************");

		Collection<String> damsInMaharashtra = new ArrayList();
		damsInMaharashtra.add("Koyna Dam");
		damsInMaharashtra.add("Jayakwadi Dam");
		damsInMaharashtra.add("Isapur Dam");
		damsInMaharashtra.add("Totladoh dam");
		damsInMaharashtra.add("Warna Dam");
		damsInMaharashtra.add("Bhatsa Dam");
		System.out.println("The Num of Dam in MH:-" + damsInMaharashtra.size() + "_" + damsInMaharashtra);
		System.out.println("******************************************************************");

		Collection<String> damsInOdisha = new ArrayList();
		damsInOdisha.add("Hirakud Dam");
		damsInOdisha.add("Rengali Dam");
		damsInOdisha.add("Indravati Dam");
		damsInOdisha.add("The Jalaput Dam");
		damsInOdisha.add("Mandira dam");
		System.out.println("The Num of Dam in Odisha:-" + damsInOdisha.size() + "_" + damsInOdisha);
		System.out.println("******************************************************************");

		Collection<String> damsInPunjab = new ArrayList();
		damsInPunjab.add("The Ranjit Sagar Dam");
		System.out.println("The Num of Dam in Punjab:-" + damsInPunjab.size() + "_" + damsInPunjab);
		System.out.println("******************************************************************");

		Collection<String> damsInUttarakhand = new ArrayList();
		damsInUttarakhand.add("Ramganga Dam");
		damsInUttarakhand.add("Jamrani Dam");
		damsInUttarakhand.add("The Tehri Dam");
		System.out.println("The Num of Dam in UttarKhand:-" + damsInUttarakhand.size() + "_" + damsInUttarakhand);
		System.out.println("******************************************************************");

		Collection<String> damsInUttarPradesh = new ArrayList();
		damsInUttarPradesh.add("Rihand Dam or GovindBallabh Pant Sagar");
		damsInUttarPradesh.add("Matatila Dam");
		damsInUttarPradesh.add("The Rajghat Dam");
		System.out.println("The Num of Dam in UP:-" + damsInUttarPradesh.size() + "_" + damsInUttarPradesh);
		System.out.println("******************************************************************");

		Collection<String> damsInWestBengal = new ArrayList();
		damsInWestBengal.add("Durgapur Barrage");
		damsInWestBengal.add("Farakka Barrage");
		damsInWestBengal.add("Panchet Dam");
		damsInWestBengal.add("Maithon Dam");
		damsInWestBengal.add("Mukutmanipur Dam");
		damsInWestBengal.add("Teesta Barrage");
		System.out.println("The Num of Dam in West Bengal:-" + damsInWestBengal.size() + "_" + damsInWestBengal);
		System.out.println("******************************************************************");

		Collection<String> damsInGoa = new ArrayList();
		damsInGoa.add("Amthane");
		damsInGoa.add("Anjunem");
		damsInGoa.add("	Moisal");
		damsInGoa.add("Chapoli Dam");
		damsInGoa.add("Salaulim");
		System.out.println("The Num of Dam in Goa:-" + damsInGoa.size() + "_" + damsInGoa);
		System.out.println("******************************************************************");

		Collection<String> damsInManipur = new ArrayList();
		damsInManipur.add("Khuga dam");
		damsInManipur.add("Tipaimukh Dam");
		System.out.println("The Num of Dam in Manipur:-" + damsInManipur.size() + "_" + damsInManipur);
		System.out.println("******************************************************************");

		Collection<String> damsInMizoram = new ArrayList();
		damsInMizoram.add("Serlui B Dam");
		damsInMizoram.add("	Tuirial Dam");
		System.out.println("The Num of Dam in Mizoram:-" + damsInMizoram.size() + "_" + damsInMizoram);
		System.out.println("******************************************************************");

		Collection<String> damsInSikkim = new ArrayList();
		damsInSikkim.add("Rangit Dam");
		System.out.println("The Num of Dam in Sikkim:-" + damsInSikkim.size() + "_" + damsInSikkim);
		System.out.println("******************************************************************");

		Collection<String> damsInTripura = new ArrayList();
		damsInTripura.add("Gumti Hydro Dam");
		System.out.println("The Num of Dam in Tripura:-" + damsInTripura.size() + "_" + damsInTripura);
		System.out.println("******************************************************************");

		Collection<String> damsInDelhi = new ArrayList();
		damsInDelhi.add("Delhi Dam");
		damsInDelhi.add("Hartwick Dam");
		System.out.println("The Num of Dam in Delhi:-" + damsInDelhi.size() + "_" + damsInDelhi);
		System.out.println("******************************************************************");

		Collection<String> damsInNagaLand = new ArrayList();
		damsInNagaLand.add("Doyang Dam");
		System.out.println("The Num of Dam in Nagaland:-" + damsInNagaLand.size() + "_" + damsInNagaLand);
		System.out.println("******************************************************************");

		Collection<String> damsInAssum = new ArrayList();
		damsInAssum.add("Pagladia");
		damsInAssum.add("Khandong");
		damsInAssum.add("Umrong");
		damsInAssum.add("Subansiri Lower Dam");
		damsInAssum.add("Karbi Langpi Dam");
		System.out.println("The Num of Dam in Assum:-" + damsInAssum.size() + "_" + damsInAssum);
		System.out.println("******************************************************************");

		Collection<String> damsInMeghalaya = new ArrayList();
		damsInMeghalaya.add("Khandong Dam");
		damsInMeghalaya.add("Kyrdemkulai (Umiam st-III) Dam");
		damsInMeghalaya.add("Mawphlang Dam");
		damsInMeghalaya.add("Myntdu-Leshka Dam");
		damsInMeghalaya.add("Nongkhyllem Dam");
		damsInMeghalaya.add("Umiam Dam");
		damsInMeghalaya.add("Umtru Dam");
	}

}
