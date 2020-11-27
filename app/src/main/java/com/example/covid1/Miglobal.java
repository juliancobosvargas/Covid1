package com.example.covid1;

import java.util.ArrayList;
import java.util.List;

public class Miglobal {

    public static List<Milugar> ListaPostas = new ArrayList<Milugar>();
    public static List<Milugar> ListaClinicas = new ArrayList<Milugar>();
    public static List<Milugar> ListaHospitales = new ArrayList<Milugar>();
    public static List<Milugar> ListaMercados = new ArrayList<Milugar>();

    public static void llenarLista(){
        Milugar posta1 = new Milugar(
                "Siete Cuartones",
                "Calle Siete Cuartones S/N \n 84233441",
                -13.515968036942764,
                -71.98234509234504,
                R.drawable.icoposta);
        ListaPostas.add(posta1);

        Milugar posta2 = new Milugar(
                "Dignidad nacional",
                "Calle Marcona S/N\n84226070",
                -13.5277498732261,
                -71.98860686136936,
                R.drawable.icoposta);
        ListaPostas.add(posta2);

        Milugar posta3 = new Milugar(
                "Zarzuela Alta",
                "Av. San Miguel Grau S/N\n84226073",
                -13.531213000797885,
                -71.9829420362035,
                R.drawable.icoposta);
        ListaPostas.add(posta3);

        Milugar posta4 = new Milugar(
                "Belenpampa",
                "Jr. 21 de Mayo, Cusco\n84223054",
                -13.524662223044754,
                -71.97770636445931,
                R.drawable.icoposta);
        ListaPostas.add(posta4);

        Milugar posta5 = new Milugar(
                "Clas Wanchaq",
                "Av. Garcilaso 415, Cusco\n84232731",
                -13.521741436036185,
                -71.97036784094901,
                R.drawable.icoposta);
        ListaPostas.add(posta5);

        Milugar posta6 = new Milugar(
                "Posta de Ttio",
                "Avenida 28 De Julio S/N Urb. Ttio\n84239673",
                -13.531797137984654,
                -71.95976775062579,
                R.drawable.icoposta);
        ListaPostas.add(posta6);

        Milugar posta7 = new Milugar(
                "Manco Capac",
                "Av. La Unión\n84241480",
                -13.537638429500955,
                -71.96032565007394,
                R.drawable.icoposta);
        ListaPostas.add(posta7);

        Milugar posta8 = new Milugar(
                "Posta 1ro de mayo",
                "84145786",
                -13.518111265285802,
                -71.94955389919039,
                R.drawable.icoposta);
        ListaPostas.add(posta8);

        Milugar posta9 = new Milugar(
                "San Sebastian",
                "Marcos Sapaca, Cusco\n990667753",
                -13.533921662524266,
                -71.9306603693864,
                R.drawable.icoposta);
        ListaPostas.add(posta9);

        Milugar posta10 = new Milugar(
                "Santa Rosa",
                "84157864",
                -13.531986550243834,
                -71.91933054827179,
                R.drawable.icoposta);
        ListaPostas.add(posta10);

        Milugar posta11 = new Milugar(
                "Tupac Amaru",
                "Tomasa Tito Condemayta, Cusco\n990667753",
                -13.53848648044551,
                -71.90672484640102,
                R.drawable.icoposta);
        ListaPostas.add(posta11);

        Milugar posta12 = new Milugar(
                "San Jeronimo",
                "Circunvalación Nte, Cusco\n990667753",
                -13.547713507269235,
                -71.88031767815741,
                R.drawable.icoposta);
        ListaPostas.add(posta12);

        //-------------------------------------------------

        Milugar clinica1 = new Milugar(
                "Mir Salud",
                "Av. Grau Nro. 1061\n84222220",
                -13.52650081910195,
                -71.97841701827267,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica1);

        Milugar clinica2 = new Milugar(
                "Cusco Central",
                "84572165",
                -13.522641288060862,
                -71.97192129394311,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica2);

        Milugar clinica3 = new Milugar(
                "Casafranca",
                "84169874",
                -13.527483235199622,
                -71.97105519736584,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica3);

        Milugar clinica4 = new Milugar(
                "Travelers Nerwork",
                "Apv Versalles",
                -13.533447817356972,
                -71.9740504480289,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica4);

        Milugar clinica5 = new Milugar(
                "San Juan de Dios",
                "Manzanares, Cusco\n84231340",
                -13.531377773420848,
                -71.96751863634196,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica5);

        Milugar clinica6 = new Milugar(
                "Juan pablo II",
                "Av. Las Gardenias O-3, Cusco\n84581830",
                -13.530465544955735,
                -71.9637655511738,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica6);

        Milugar clinica7 = new Milugar(
                "Pardo",
                "Av. de La Cultura 710, Cusco\n84231718",
                -13.521202719585148,
                -71.96582253054481,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica7);

        Milugar clinica8 = new Milugar(
                "Medical Cusco",
                "84597621",
                -13.535121529138062,
                -71.95833561843502,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica8);

        Milugar clinica9 = new Milugar(
                "San Jose",
                "Av. los Incas 1414, Cusco\n84243367",
                -13.525125147717004,
                -71.95559964197284,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica9);

        Milugar clinica10 = new Milugar(
                "MacSalud",
                "Av. La Cultura N° 1410\nAv. Los Incas N° 140\n582060",
                -13.524405658153261,
                -71.95531894820648,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica10);

        Milugar clinica11 = new Milugar(
                "San Juan de Dios",
                "847312596",
                -13.521800591554856,
                -71.95348167991763,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica11);

        Milugar clinica12 = new Milugar(
                "Maxilofacial Cusco",
                "84532146",
                -13.52565006073129,
                -71.94985291676414,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica12);

        Milugar clinica13 = new Milugar(
                "Peru Suiza",
                "Av. Peru K-3-Urb Quispicanchi Cusco-Peru\n842421 114",
                -13.525827085306764,
                -71.94563486004637,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica13);

        Milugar clinica14 = new Milugar(
                "Virgen Guadalupe",
                "Urbanización Santa Úrsula O-4, Wanchaq - Cusco\n084240 447",
                -13.528423430117819,
                -71.9411133463565,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica14);

        Milugar clinica15 = new Milugar(
                "Cornejo",
                "Av. Cusco Nº 211 \n +5184273529",
                -13.527951369530266,
                -71.93974778853071,
                R.drawable.icoclinica);
        ListaClinicas.add(clinica15);

        //----------------------------------------------------------

        Milugar hospital1 = new Milugar(
                "Hna. Josefina Serrano",
                "84232331",
                -13.519257258036125,
                -71.97796995876494,
                R.drawable.icohospital);
        ListaHospitales.add(hospital1);

        Milugar hospital2 = new Milugar(
                "Contingencia",
                "Urb Primavera , calle Carlos Ugarte s/n, Huancaro\n986749414",
                -13.529975178232611,
                -71.97582647909462,
                R.drawable.icohospital);
        ListaHospitales.add(hospital2);

        Milugar hospital3 = new Milugar(
                "Antonio Lorena",
                "Av. Carlos Ugarte S/n Urb. Primavera –Santiago\n84226511",
                -13.531066791188168,
                -71.96745670133427,
                R.drawable.icohospital);
        ListaHospitales.add(hospital3);

        Milugar hospital4 = new Milugar(
                "Solidaridad Wanchaq",
                "PLAZA TUPAC AMARU Y AV MICAELA BASTIDAS S/N\n943 094 915",
                -13.52153981849014,
                -71.96546632735468,
                R.drawable.icohospital);
        ListaHospitales.add(hospital4);

        Milugar hospital5 = new Milugar(
                "Essalud Adolfo Guevara",
                "Av. Anselmo Alvarez S/N\n84237341",
                -13.524566658409638,
                -71.95954624064613,
                R.drawable.icohospital);
        ListaHospitales.add(hospital5);

        Milugar hospital6 = new Milugar(
                "Regional del Cusco",
                "Av. La Cultura, Cusco\n84231131",
                -13.523369224959117,
                -71.9546762600548,
                R.drawable.icohospital);
        ListaHospitales.add(hospital6);

        Milugar hospital7 = new Milugar(
                "Sisol Cusco",
                "Urb. Larapa Grande C1-7B, Distrito de San Jerónimo.\n84276494",
                -13.531453289077007,
                -71.90353404702361,
                R.drawable.icohospital);
        ListaHospitales.add(hospital7);

        //-----------------------------------------------------------

        Milugar mercado1 = new Milugar(
                "San Pedro",
                "Mercado Central",
                -13.519675832149881, -71.98258847066697,
                R.drawable.icomercado);
        ListaMercados.add(mercado1);

        Milugar mercado2 = new Milugar(
                "Zarzuela",
                "mercado",
                -13.526852621201087, -71.98387593098997,
                R.drawable.icomercado);
        ListaMercados.add(mercado2);

        Milugar mercado3 = new Milugar(
                "San Blas",
                "mercado",
                -13.514001008706533, -71.97271794152391,
                R.drawable.icomercado);
        ListaMercados.add(mercado3);

        Milugar mercado4 = new Milugar(
                "Rosaspata",
                "mercado",
                -13.517512492502235, -71.96644969886513,
                R.drawable.icomercado);
        ListaMercados.add(mercado4);

        Milugar mercado5 = new Milugar(
                "Wanchaq",
                "mercado",
                -13.521724286793411, -71.97141842869318,
                R.drawable.icomercado);
        ListaMercados.add(mercado5);

        Milugar mercado6 = new Milugar(
                "Virgen Asunta",
                "mercado",
                -13.530443890588446, -71.97308670404412,
                R.drawable.icomercado);
        ListaMercados.add(mercado6);

        Milugar mercado7 = new Milugar(
                "Huancaro",
                "mercado",
                -13.53619700496286, -71.98015725932757,
                R.drawable.icomercado);
        ListaMercados.add(mercado7);

        Milugar mercado8 = new Milugar(
                "Ttio",
                "mercado",
                -13.530974953112883, -71.9602808055812,
                R.drawable.icomercado);
        ListaMercados.add(mercado8);

        Milugar mercado9 = new Milugar(
                "El Molino",
                "mercado",
                -13.535164404917762, -71.96155532627607,
                R.drawable.icomercado);
        ListaMercados.add(mercado9);

        Milugar mercado10 = new Milugar(
                "San Sebastian",
                "mercado",
                -13.530856939362334, -71.9332731050667,
                R.drawable.icomercado);
        ListaMercados.add(mercado10);

        Milugar mercado11 = new Milugar(
                "Tancarniyoc",
                "mercado",
                -13.531653531320256, -71.92726465032648,
                R.drawable.icomercado);
        ListaMercados.add(mercado11);

        Milugar mercado12 = new Milugar(
                "Santa Rosa",
                "mercado",
                -13.53227684748614, -71.91955013530969,
                R.drawable.icomercado);
        ListaMercados.add(mercado12);

        Milugar mercado13 = new Milugar(
                "Del Sur",
                "mercado",
                -13.538649470766288, -71.90258687172854,
                R.drawable.icomercado);
        ListaMercados.add(mercado13);

        Milugar mercado14 = new Milugar(
                "De Mayoristas",
                "mercado",
                -13.548857113458292, -71.89151067992432,
                R.drawable.icomercado);
        ListaMercados.add(mercado14);

        Milugar mercado15 = new Milugar(
                "tit",
                "mercado",
                0.0,
                0.0,
                R.drawable.icomercado);
        ListaMercados.add(mercado15);

        Milugar mercado16 = new Milugar(
                "VinoCanchon",
                "mercado",
                -13.543340320584694, -71.88780850076304,
                R.drawable.icomercado);
        ListaMercados.add(mercado16);

        Milugar mercado17 = new Milugar(
                "Paraiso",
                "centro comercial",
                -13.522810848720878, -71.9821187472602,
                R.drawable.icomercado);
        ListaMercados.add(mercado17);

        Milugar mercado18 = new Milugar(
                "El Carmen",
                "centro comercial",
                -13.520530655078156, -71.980306273355,
                R.drawable.icomercado);
        ListaMercados.add(mercado18);

        Milugar mercado19 = new Milugar(
                "Tres Cruces de Oro",
                "Calle",
                -13.522557685163736, -71.98178347730669,
                R.drawable.icomercado);
        ListaMercados.add(mercado19);

        Milugar mercado20 = new Milugar(
                "El Ejercito",
                "Avenida",
                -13.523904110364665, -71.98120658770826,
                R.drawable.icomercado);
        ListaMercados.add(mercado20);

        //String ti = ListaLugar.get(0).getTitulo();

    }
}
