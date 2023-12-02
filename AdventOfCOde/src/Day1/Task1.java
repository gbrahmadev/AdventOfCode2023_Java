package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		String input = "sixrrmlkptmc18zhvninek\r\n" + "jcb82eightwond\r\n" + "twofourthree778nineeight\r\n"
				+ "sqpxs1cgcrmctlgqvzxbcjzgr\r\n" + "nqkjxbmbpkz9eight8\r\n" + "one6fourfiveqndtrvgkkgthppnine\r\n"
				+ "zbrbdpbfcfxcqq5oneninejfgqpkfn\r\n" + "hvlstzgvmjfivefourqjqtxdjmbxfour4four2\r\n" + "13dzbmbtl6\r\n"
				+ "fourone2pmlxzzbmnfxg2\r\n" + "3fourrbvvlrsrbb2858\r\n" + "vlz4six89\r\n" + "75threeb\r\n"
				+ "fourp783fiveseventhree\r\n" + "2gxvcbsmn6\r\n" + "896\r\n" + "dnblxtxxpstlsix56\r\n"
				+ "4fivecl185\r\n" + "onefk8sdljtfv37zsxsxrv7qvrpnmd\r\n" + "fourdvhzp7foursix\r\n"
				+ "seventwonineseven27jbrqpxfx8\r\n" + "1threenine241gnrdfqn5\r\n"
				+ "sixnrsqdgmkvs7sevenkgjgtglmdq9dkdzsdqmq2nptbxnxghm\r\n" + "llbkdcpxkg1tnmnmrbskpdb\r\n"
				+ "zb7nvjz1eighttwo6nine\r\n" + "5threeeightwor\r\n" + "tgjmdbr4sixone5\r\n" + "4twoseven7tjmklbl\r\n"
				+ "lt2vqgbkzjpcjzeight3frfzqgbhvlx4\r\n" + "4sixseven3xbmsfxrrvv2st5\r\n" + "gqlp7\r\n" + "h137four\r\n"
				+ "3three7three7\r\n" + "nine9sjlzcpjvhcnbhbthz4oneb8kfb\r\n" + "jlrjz5two\r\n"
				+ "sixthreeeightsgnjnmffq3\r\n" + "sixone87onepclf3\r\n" + "two4six\r\n" + "5dsnxrcfxb4\r\n"
				+ "fiveninesix4\r\n" + "eight9jhqttcplxhtjthreevncsfnkpn\r\n" + "4mgqksbchbcrxp5fivefourlzlzp\r\n"
				+ "xhzone6\r\n" + "7nmcxjlmq94twofivethfccvn\r\n" + "six769fourtwoseven\r\n" + "two41stkvkhdgthree5\r\n"
				+ "jvpftbhljmcttkr5one\r\n" + "9ldhzhplpzttwosevenblfxfdfour\r\n" + "fivekcfmfmndbhtwofour32\r\n"
				+ "49qsslhxjqv1tsfqhkg\r\n" + "five2zzstkq3935sevenpbb\r\n" + "8sevencxvfbkv2p8\r\n"
				+ "lsmmnpnfourhjbfk67\r\n" + "fourtwo4onethree\r\n" + "1jf1eightdhvnclf2four7bmdvh\r\n" + "tx4xczz1\r\n"
				+ "5qjlqp\r\n" + "sevendmzqnjdnoneh1\r\n" + "72seven7pvjxdlsix1\r\n" + "four1eightvbbjh\r\n"
				+ "8451\r\n" + "fivethreesdtmtr5four\r\n" + "gqhtwone11ninethree4ptjsqlg4fivenine\r\n"
				+ "one7xctgtrtwoeightwovkv\r\n" + "36eightsixeight4xnmhvzrnbb6four\r\n" + "pjrtblbj759xpbr6\r\n"
				+ "hcbzmzqssh72eightthreesixgdmfivelmctqrz\r\n" + "rhkctwo5twonine2\r\n"
				+ "cdptxn6sevenjktrlzlnlqxdtwoeight\r\n" + "six36fnqmdcjgjgbqgqcgffivetskhjhkpdqfive\r\n"
				+ "qmpm111nine8\r\n" + "73pcctxthreetwo4nine3fivetwonehfs\r\n" + "nineeightnnfsixpt3kbbqfkhhn\r\n"
				+ "bvpmkrjmzkvdnbhdnine47\r\n" + "26dmbqnt4oneseven5qvxfhl\r\n"
				+ "2sldrlqzone1pfdlsqdgpmnktdh3vtplbsvbx4\r\n" + "238xrtqfcfgsrmrhkxz6\r\n"
				+ "5eighteight5sevenseven\r\n" + "qtlnninesixxjnmxkntpf9six3pbrpljxhb2\r\n"
				+ "xrmkj137tkxktdnine5bnnhp\r\n" + "gkqzprfcrfcgpxnvggsnccsrrk64oneseven\r\n"
				+ "zzmgmkvgrnknsq6tjgktmbghkl6\r\n" + "xeightwoone91\r\n" + "9j\r\n" + "eightlm63\r\n"
				+ "fmctjfspmkblkvjtrcjdfhrtwo4fourdnkrzh\r\n" + "3rb73\r\n" + "8mkzqthreeqtvhc7\r\n"
				+ "qgmbchqqzsvx45eight\r\n" + "oneknnlhjffrxhdzbgj1seven\r\n" + "pv1fourtwo\r\n"
				+ "fxvgcx9vrlqssrrqvl94\r\n" + "sn6\r\n" + "57twoonefourthree\r\n"
				+ "gtwoeight6njfdpvcslcponenineqrxjsf\r\n" + "8six1two6jkvltvgjfjsdn\r\n" + "fourrxtjhcdxhr1fdqdj\r\n"
				+ "one2onefour\r\n" + "three3four6pphqkx8vrgvbtmqckpz\r\n" + "nine5nskhdvvbnineone\r\n"
				+ "7131eightone\r\n" + "one1sgckzz\r\n" + "sgpkknine6threehkqchz\r\n" + "4twoqvbpxzpjj1njqtphjbr\r\n"
				+ "4pfcfnfqftbfnxds\r\n" + "bmhthreecsslmgpzzddpxfthreefllkhdtrlj2\r\n" + "9threeeightninefqdfptj\r\n"
				+ "ninenfbsevennkngdg21\r\n" + "1fourthreeonethree3\r\n" + "tjpjbmrsevenhcllbgdqxlctdk5\r\n"
				+ "2srjxhvbtqponefourtpsgthckseight6bjvnc\r\n" + "68b\r\n" + "vrcqnglljm19nftnzzjdzhvhzrgznine\r\n"
				+ "fivensjpfvltr2cvfhkcfsvt4pnmttrgrr8five\r\n" + "tgzdbrgdfoursevenseven8fnxghs\r\n"
				+ "fourmhmql9rqkpvpgj7\r\n" + "7mgk\r\n" + "2z259nzfqfdhthreeftwo\r\n"
				+ "eight57lzhvpjcxpfivevkszhzbfourfour\r\n" + "sixone984two\r\n" + "threezdvkl15hk9eight\r\n"
				+ "4dxxpjttvsdtwofivenine\r\n" + "99xbp8fivemcvonefivezlndv\r\n" + "seven7six8fhxhxqgr3fsqqqmzdtj\r\n"
				+ "one579vdplvfghvf\r\n" + "qzzthree1kghtwomnlnxpkmeight\r\n" + "44eightonevnzxchddbnzrfpvxsix\r\n"
				+ "fivefive5zfsvhfpkzzfiveeight3mzrkkk4\r\n" + "46xxzbffbmgeight9dcmtwo\r\n" + "tvmgkxbrtdv6mzcpkf\r\n"
				+ "kvbczdkgzrxsxm3one557onevzdhzgn\r\n" + "xrfxxzlmtlmvgpvninethree1\r\n"
				+ "4rnzxgfplmnmjppqv6txztmmcpnf\r\n" + "five47fouroneqqrj\r\n" + "nine5cxxfcqmeightjqztkdqxnpqthree\r\n"
				+ "2zlvnvptqkzsbvp9six4bfhp\r\n" + "bhvkfxhdnrmkfjvsmkt6eighteighteightzzvpddg\r\n" + "12seven49six\r\n"
				+ "5rstmpbrt5fiveone3one6\r\n" + "24four\r\n" + "fiveeight9foursix995\r\n" + "8ktwonxzvt\r\n"
				+ "gf6six39zxvzcfbtbxkvqrps\r\n" + "gqvpkvvgcxctwo7\r\n" + "52mhhzfivebpn9\r\n" + "5onethree\r\n"
				+ "one2cxzklfh9\r\n" + "flrtmhfm985xmkpcdhr\r\n" + "4ltqdsixfour7483\r\n" + "one9nine26gjtzn9\r\n"
				+ "773xhnnch78\r\n" + "one7sixsixgghp\r\n" + "5292zljdfhjseven\r\n" + "seven3onesixthreekz\r\n"
				+ "seven5seven3seven4zgtnnkkgseveneightwosg\r\n" + "eight9vnfsvksv\r\n" + "5seventwo9\r\n"
				+ "onesix7\r\n" + "4one3two35nine\r\n" + "5mmrdtrzctqxggtzhplfnphgp\r\n" + "v94rpkdzeight6foursix\r\n"
				+ "four1mslzzghlpjtblzfour\r\n" + "scrv2four4dxfqpcvnml\r\n" + "8sxjs1141fivefive6\r\n"
				+ "3eightpqsxgklhkbkdsppone9\r\n" + "fcvpsvmsevenfivesqsqvhm6hqmshds\r\n" + "5sixfive677\r\n"
				+ "kgmpqfgjtk9hghczzhpsgfhsnghdxngd4\r\n" + "2xzph98twonesj\r\n" + "kphxn9\r\n"
				+ "sixeight625ssnpmlpsbtwo\r\n" + "twofourhbdmm97\r\n" + "ndseven1\r\n" + "onelf51\r\n"
				+ "88khzmskgldcgttzqnzxdh4bnvxzgdr\r\n" + "lchrtnsxtwo7749lbdgfour\r\n" + "mmrktfqvvkzrglcpkfjrlm34\r\n"
				+ "5six7psdcckhs413threebqnr\r\n" + "seven5oneqfourkf\r\n" + "hsngkzgnfninegmjvtmtchdgs5grf\r\n"
				+ "8qxlscsevensix8\r\n" + "bvbhc7dfplnk\r\n" + "5jjcshzxhgzs1mpqm9\r\n" + "vzqcvvtqjone7one\r\n"
				+ "one5threeseven\r\n" + "hbtvthree1\r\n" + "8five2lonecflvtjqh9eight\r\n" + "xckhrnseven9six\r\n"
				+ "vggclcqcnfsix8seven924j\r\n" + "jfjlzm1fivegplflrcvsix8\r\n" + "zd6psbxlv\r\n" + "mtcsbn2\r\n"
				+ "eightd29rlcd4\r\n" + "six41one6csgdbndn\r\n" + "four1mh2fourdfktmszp\r\n"
				+ "14nsnlqqlgfourxbzzxfztvbxsnxttjmktcxkkkzfphppsczqoneightgc\r\n" + "9vlkdznbjt5zqthreetwonedv\r\n"
				+ "hqqtrzmknine1\r\n" + "6eightsixdmkgnvkjqsqsdhlfzpxqpqdzrlvxm\r\n" + "8four2xcztwo\r\n"
				+ "mptznhrtsq5fourfour4one\r\n" + "8zxnrngjgtgq\r\n" + "7s\r\n"
				+ "68zrdjfxfiveonerbrqbzxpnhsxkbsqsx5\r\n" + "2eight4nine\r\n" + "fiveeight6two\r\n"
				+ "12jvtjssix87\r\n" + "qcxtdnzhtj665bqffftxdp\r\n" + "gsxeightwo37v1\r\n"
				+ "fxbvtshpbldxfdnkk69jhvgktlthree6\r\n" + "2hbxztgsmqsgg57\r\n" + "five7sixfpjqdcbvxfgzcfgb\r\n"
				+ "soneightthree29qlsddxxfl5\r\n" + "cn2\r\n" + "29six\r\n" + "skrbzfmsixp26twofournine\r\n"
				+ "two8onepcddklbzfoureight8\r\n" + "nldvphs7dbqxsfflxx4\r\n" + "8pngqfour\r\n"
				+ "ninefive69nineeighttwo6\r\n" + "nine54lnzkckcvteight1bhznxgsixeightwor\r\n"
				+ "five18sevenvgktwo47\r\n" + "1eightkcmhsb\r\n" + "djcmqbvmfsztncvvthree5\r\n"
				+ "sixfbbhffjnrz1mtcfbqs76llrvjghtfive\r\n" + "five5bkxn4\r\n" + "8eightwoc\r\n"
				+ "khvcvqthree7rthjfivezdglhfnstbtjglxlpkztwosix\r\n" + "72lxsfkmzrb1\r\n" + "nmhqmmxlqnpfour8\r\n"
				+ "zbgtwonezksvdvfqzthreesix6dlc5\r\n" + "6zvn6\r\n" + "5pmrjmgvsdcsjlg86\r\n"
				+ "twoeightseven21cvntvr\r\n" + "3qmqjjqtjskqtthree8sevenxm2\r\n" + "four5fourmbdx\r\n"
				+ "jpdmdb35vkjdflmlt\r\n" + "224\r\n" + "six3msltlcgtrnttcvtkrnine\r\n" + "nine1d\r\n"
				+ "eight6eight6\r\n" + "sevenm7\r\n" + "threelkngfmstfour9ninelj\r\n" + "5rjbbxmchhfhl\r\n"
				+ "1two6679twozcgbbldmznvhd\r\n" + "eight2tgxkhtfmrk9sevenxntpkhkvjb\r\n"
				+ "ninethreetfgtsh6ztcxczsxr\r\n" + "9sjzjdeightmbvrvx4\r\n" + "6fivetwodszsmffjbh\r\n"
				+ "sevenfivezcbqhhsntfbpkz3one3\r\n" + "7onenine11\r\n" + "glghbpvrbfqsfvnvpxlb5vvqkt8eight\r\n"
				+ "rvhqbhlmonenine96\r\n" + "npgvjlkdxmsevensixxrkhlt5\r\n" + "mhqf52scsgsxtwovcpq\r\n"
				+ "zrvznqpcjhtsghfb7\r\n" + "five8threeonedl\r\n" + "8threefiveknqhmm4five2\r\n"
				+ "xdbd4cchcfpvzthreenqqbdkfbnfspmklhvp1ztzs\r\n" + "fourmn932eight6rjq6\r\n" + "tdj3three\r\n"
				+ "2nine98lcpnbchtcfqvqmbrzlhzjjrcsmzgmd\r\n" + "1tfive\r\n" + "6cbhhqrvjkzfive4pbnrr5hbvdbxln8\r\n"
				+ "2eight8three\r\n" + "lvveightwo9ninegrlptxdskq\r\n" + "3xpcpqkrznrgq72six\r\n"
				+ "9pnczone4two4tzjktcktzeight\r\n" + "6eightldtmkj\r\n" + "pjc9nvbhjmhnine\r\n"
				+ "bznzg4sbdmhglddnvbrxtr5nineeight6seven\r\n" + "51four7eightwopkv\r\n" + "323\r\n"
				+ "3cxmrtnjdonehdsxlfneight\r\n" + "7kfsxscrsrffour\r\n" + "six2sixthree6\r\n"
				+ "2nljlkkdoneseven4dvkplq9eight\r\n" + "31six9jqrgzmjlk\r\n" + "ninefour659\r\n"
				+ "zjcfjzbfivesix2bqtnbdzlssvr\r\n" + "4onehzrmb\r\n" + "6dvfnpbdnr1fhtmdddqx\r\n"
				+ "phvgzphlvqeight1\r\n" + "22s5\r\n" + "fivetwo9\r\n" + "gxczffbjgxonerhxklzvkmp89\r\n"
				+ "fbrxkzpsmb59997\r\n" + "tmf6\r\n" + "ninefournine8\r\n" + "42fourtwoeightsix96\r\n"
				+ "vmhqthreeshcdtwo2three28\r\n" + "lpzbfpfhxj8rbspbrjgd882\r\n" + "9threesv\r\n" + "6xvqch\r\n"
				+ "6sixdthree5sevensbxnxvsixthree\r\n" + "five2jzsconeightm\r\n" + "three9three69eight\r\n"
				+ "7789qfhlmznpqzrg3\r\n" + "bbf5dtpqhs2jstcbkcfmc2nine\r\n" + "eightmpppb6fpdonecrdrbjqtc\r\n"
				+ "nineeight1nine\r\n" + "four2tpqrhnj8fivexmvhtsfive\r\n" + "gbzzxdd8\r\n" + "onehrjlhprzz5\r\n"
				+ "fourzxxpl2onetwo\r\n" + "5four5two97\r\n" + "threeeight2\r\n" + "5one68656scpqt\r\n"
				+ "7qljfddcld1czjb6fivehtqcpnbjfnmrrthree\r\n" + "9lrzbkvqmjfv5qkrlmjkrx436\r\n"
				+ "hfivetwoxgjkfc72two7\r\n" + "gbbbnscg6\r\n" + "glrhbfrfivehfkfplnrt49seven\r\n"
				+ "nine3sixninefive3zksdxtbbf\r\n" + "ninesevenvgnlhpdb123twogfvscpk3\r\n"
				+ "fivefsrtpxzlltnfnine1ninevzsxbnine\r\n" + "7nineone44bdxoneeightnfpckpdjsq\r\n" + "rcrtqnnrm15\r\n"
				+ "eightfive8\r\n" + "eight2dqzcjfkfsfoureightfmjrpdkqj9\r\n" + "one69twornine\r\n"
				+ "fivefjpzeight6\r\n" + "5qxqdcl7qzfqvmsfnnine9fouronedmdg\r\n" + "7sevenone4four5eightone\r\n"
				+ "phxdrlcd3two\r\n" + "fnoneight12vqscqzxdgdzsvfqggbt9zphpvndl\r\n" + "eight6jhjqrvsgbteight2\r\n"
				+ "gdhznsvfmdeight6jpvdmrdsix92one\r\n" + "onescsrmks474ninetwo\r\n"
				+ "51bmcpkkttczbsbhvfdzgfbccbllxskmtxvs\r\n" + "61eight\r\n" + "qfplfour7fourvhsbxtzrb7three\r\n"
				+ "ninefg8two\r\n" + "8seventxeight3gzbvjmbcmzoneightrlx\r\n" + "16twobghcqnfiveseven\r\n"
				+ "one26sevenone\r\n" + "three4sevenone996fplzjqh1\r\n" + "pkszjvhtdg9six\r\n"
				+ "eightfcbbchqtxbvzmdnj1fourkvldvbzltm8\r\n" + "5sevenfivevhcrl78\r\n" + "7bjmr96ghmzhzh641\r\n"
				+ "seven71\r\n" + "ljstghtkzcthree64two3hbvbgconethree\r\n" + "9fourninednbrkdfnxeight2zppqsnx\r\n"
				+ "zfjm8ktwofivezr\r\n" + "qtfvmhvpthree4fivehsxkxnpchmfcvr2sixfour\r\n" + "ninetwo3dthqone\r\n"
				+ "six2ncdntspl1fivenmxzxh81\r\n" + "twoqtpfbfive8mhvkjstfp7gddzmmdnxqrvp\r\n"
				+ "threesixone3tgbtbone81one\r\n" + "8vqmtnfkhm1\r\n" + "zgtldxtbgxgfour8eight65\r\n"
				+ "hbk6threeseven\r\n" + "1tpnrcfivejbqllpgx\r\n" + "twotwo4xcppqxftxeight8six2\r\n"
				+ "2seven5bnvqdfbtwo8eightsflgdzqczpcf\r\n" + "two45\r\n"
				+ "4kqrscxrsdveightflhrmcpxrnqfrzrsixkj5oneightbls\r\n" + "5jttone1six\r\n"
				+ "nine95eight3fourseven\r\n" + "fivepkknbrqfkdhk8ndt7three\r\n" + "sevenfivetwo4vqkjlznxl9oneseven\r\n"
				+ "nlzrrsbqllsevenfive94threecmzbp\r\n" + "qnszclmv6eightthreeeighteight1nine\r\n"
				+ "oneninesevenmmqpd6oneninenjvcrbgnjm\r\n" + "jptwone67kqxkdfscsjmfseven14kz7\r\n"
				+ "threexzxlgceightfour8\r\n" + "3fzbtwofivefour6\r\n" + "hdr4plslvxqxm6sixnine\r\n"
				+ "one62ttrpmhjvfk1\r\n" + "foursix5phpfcxzrrbhsv\r\n" + "eight81\r\n" + "7cfdqxdqjq\r\n"
				+ "69eightfive\r\n" + "6nphsmsqsevensevenonefourbsmg\r\n" + "sixeightsix9vk\r\n"
				+ "freightfkthreesixfour6hzdmrcqzbs\r\n" + "vclmkqdqeightseven5eighteight5bbvzqlslt\r\n"
				+ "nfbzpffd198six\r\n" + "jpeightwofivethreetfzgnpfive1\r\n" + "sixseven2trjjh\r\n"
				+ "4ssfourtwopqsgvbvktk\r\n" + "five8twoonefksixseven9\r\n" + "5eighteight2g1six7\r\n"
				+ "fivethree9twonelgh\r\n" + "4fourxbnhjfoursix\r\n" + "lqdspqgjnnhxnine99oneninefourttpskhdzhq\r\n"
				+ "fskvvccb178\r\n" + "eight3twogsjlqhfhr\r\n" + "sevenklhxjjlzrx7sevensix\r\n"
				+ "84nine5zqjbhjsxvn61sixone\r\n" + "two9htsj\r\n" + "sixfiveninep75tgggjszfbsix\r\n"
				+ "sixbrthjrnnvmqgb8\r\n" + "tpcb25twothree\r\n" + "9fxkfzmqdgll\r\n"
				+ "cnqjxttzpthree2vfxrklhrmgsevenvsjkf\r\n" + "tljlxbfbk43\r\n" + "mcpjvsevenseven5three4\r\n"
				+ "cvvckfncxjlxrp381four1\r\n" + "63vksn7six185nine\r\n"
				+ "fourhbg8thjnmvlctsixninejpjkxqhcljrvgrm7\r\n" + "649eightone1four\r\n" + "nrmjcbpdsb6fourpcbpb\r\n"
				+ "one6nineone65\r\n" + "g2x36\r\n" + "nine9sixvbnzsqbrj\r\n" + "four3sixhfngsjrsnth977\r\n"
				+ "seven9692dfchqbdzztmfztl\r\n" + "six1pdtgbdhzmqtmhz6ninetwo\r\n" + "rzjssbsz92six1four\r\n"
				+ "4sevennineninesixvgjsxqrgnbgfpzpggmkzjrq\r\n" + "5onefourthree7seven\r\n" + "9zgjt\r\n"
				+ "eightnsrq37qhthree\r\n" + "czknlpbntwoseven1twopfhfdhrkgh8sevennine\r\n" + "3eight9\r\n"
				+ "sevengltpjfpkb32ninetwo5\r\n" + "five8ninehxgkcfxm5fthree4\r\n" + "8three9drtnqx\r\n"
				+ "lldtcdsfvvqcsvprgggnfourhklqqsjbvttskq3\r\n" + "vrxmtwoftjngsfour1sixlfbdkxbppj7\r\n"
				+ "khvvrrhc2eightfive9\r\n" + "kmsdthsbffjxdgfvmppgrfglxkplv2pvtpm48\r\n" + "49gzlbspqv45qdsvp9five\r\n"
				+ "threehzjcp6threed4\r\n" + "sevenone6onefivefourcpznxpseven\r\n" + "85zc6\r\n"
				+ "eight92fccninefourthree\r\n" + "36hpqnpmmxrhsftwotpt\r\n" + "11six6\r\n" + "5vzkjxh\r\n"
				+ "4ptvlmns\r\n" + "19f41seven7twonesmr\r\n" + "39threevrvjhfpzmp1seven38\r\n"
				+ "five6eightfourqjgfvhqjclt\r\n" + "ktjsgzqkzgplz85\r\n" + "242sevensevenninelrxhqvddb6mbfxmx\r\n"
				+ "54threekfcqtpfgeightvlm\r\n" + "sixfivetwo82seven8threes\r\n" + "vtckldxdssix5mfjrmhvtlninemq47\r\n"
				+ "977sspjhmddkznine1sevengjnm\r\n" + "ninexmjfhhnhhv3ckndjbdxjcfive4\r\n" + "toneightnine96\r\n"
				+ "twoxfsix5qtjghvqnjseven9six\r\n" + "fflplfmqx73fivethreeqmsncsl2six3\r\n"
				+ "xxvbfcbb7kkjzgmtvp38df2gcfhjtt\r\n" + "knthlxc795foursevensevenseven\r\n" + "twof91two4\r\n"
				+ "four9sixjkjqcrnine9eight\r\n" + "sixnine1two5\r\n" + "mrrhthtfbszfxqpkhs57\r\n" + "five985tmcr\r\n"
				+ "l4eight\r\n" + "twosix7\r\n" + "ggztprpshxbgbvgllfjxr7x2ql\r\n" + "9one6nine3xttqxqjnjsvknzg\r\n"
				+ "1nine8172\r\n" + "1npfxpgcmbckgtcgvlksevenjfdbs8sevengqdcsn\r\n" + "eightzbjqsix613nine\r\n"
				+ "sixkfczsxbnpfourzsninegtjkg5five\r\n" + "47four4gtwofive\r\n" + "jczqhs41\r\n" + "2jzmpchxv\r\n"
				+ "xxxx8eight36sixpzpdvvvvntwo\r\n" + "two649nine6\r\n" + "four36sixhfzslcnhpssixthree1\r\n"
				+ "9eightninefivez\r\n" + "933cvvf1sixsvkr21\r\n" + "zrsnsqdcfmxm9fsjqfzd7\r\n" + "five7sngmpcz\r\n"
				+ "sevenlzrzgddch5dnvvkzf3sixsix6dnhtbkq\r\n" + "5lbdtxdzoneone6\r\n" + "vkjvhl4mslfs\r\n"
				+ "pvgvmtxvsjdpth39\r\n" + "gg83ltnfcsv4seven\r\n" + "lksmpxxd91dnkjq1fktbfmvgh\r\n" + "djfslttn2\r\n"
				+ "onefour9three8sgbtlbtsmh\r\n" + "qnrrtjxtninefive88sixmhhbqs78\r\n" + "mgrpmfvvxf37onefour478\r\n"
				+ "two26two\r\n" + "4three3five767\r\n" + "eight5l\r\n" + "3pm8cpkczckxfc\r\n"
				+ "6nine5one2841phpgfxhfr\r\n" + "4threetwofxblrfnfhj8eightone\r\n" + "ninetwotwoqk9fourqmzzz\r\n"
				+ "211127mkhpmsr\r\n" + "mssppjqvlt75xjccfcjfiver\r\n" + "57mfour\r\n" + "rdj6smlgs\r\n"
				+ "gjllvdmmgktwodhnnbsfourbvqvlvpcv6v\r\n" + "seven2fiverthjdnfqgnine\r\n" + "7sixtgns8xfmrx\r\n"
				+ "sixdcfpbdt3lcnlsxxone1\r\n" + "9jxpl5sjzqxxk9\r\n" + "four2bzcdrbmfiveseven1four\r\n"
				+ "jtwonefivefvftvbpsptftbvpxzz2fhgmlqrfsevenvrznjjlchbqtrgbb\r\n" + "4seven3crjjzzbseven78gkcjf\r\n"
				+ "djnqxxtsevenpthdvddhdm5977three\r\n" + "threeonethreex92bnmpv3\r\n" + "klgxtpg4one3kcnhfqp\r\n"
				+ "2dhsbc98\r\n" + "mrqfvbgjqnfpggnn2spmjkvbchpzpcgcmzvcddtl7seven\r\n"
				+ "3xccrgznljpskhxnqbtjtcvmrmthreef\r\n" + "4jphblzdzpfouroneone\r\n"
				+ "68twotmmsdvxtwotworrjvzfiveseven\r\n" + "864861\r\n" + "1qzcctgzsixjtlztmdrtd2\r\n"
				+ "4seventwo62\r\n" + "one8kjkjvtvhfive6tsvqnine5tkdsv\r\n" + "7m2\r\n" + "twoeight77sevenfs\r\n"
				+ "vb8gflhvvf7hleight54\r\n" + "fourcxmkbmmzbhz494gncgbsj\r\n" + "bjzzsllj5gphkfnrncp3eightnine\r\n"
				+ "four73\r\n" + "psvtbtf93zgdpmjxrmvsjmceightpsmhvhtfrthree\r\n" + "492fkvcvcrrkhcxtgdbdclzn4\r\n"
				+ "bmf5\r\n" + "twovqfxqsfgr8glst1three1\r\n" + "qhqfglndqzbrhvxjdhgddnfl57vmzseven\r\n"
				+ "tptfourfour4threembr2\r\n" + "94four\r\n" + "57xfnxbcqntkrtzpzcvfbxtjjoneone\r\n"
				+ "7nbsmqjqzthreegddkfournbdxlrrl\r\n" + "jdmnzjpxklfjbnbqtbc2onefour4ninefivenrhdkzpjcn\r\n"
				+ "9621nine4\r\n" + "3qbtrqn4\r\n" + "3bs\r\n" + "5qncklxjnzr4seven\r\n" + "64sevenjdpmgpvqszcb\r\n"
				+ "sixeight3five89\r\n" + "4twothreeseven8nzd1four\r\n" + "7ntnp8xqhs\r\n" + "fourxfzdrjseven8four\r\n"
				+ "3lmgfpfbkrb\r\n" + "jqfsptcs98gjgvgbeightsevensevenninesrqxjoneightdvb\r\n"
				+ "fivesrzpr9fcntvgjeighttwonjmthree\r\n" + "2hdtrbvfjhpt3seven439\r\n" + "th8sevenseven\r\n"
				+ "xdnbklcrz7two6fivetwosnfszfffqtrbhtr\r\n" + "6sixninesdqlrc\r\n" + "fourxjtddtqgdssevenfive6\r\n"
				+ "2ninethreeone\r\n" + "4four8\r\n" + "five62fivefivermd2six6\r\n"
				+ "eightsevenfour8thrmnsevenflmhqvmptnnine\r\n" + "eightdd4threeeightone7rtf\r\n"
				+ "gkkonerz668srfkl\r\n" + "zlt6cv3ninetwo\r\n" + "3seven3bgklkfceightsevenbhvjjd4\r\n"
				+ "9seventhreellgvjs89\r\n" + "fivemjlvqdtp2czcht\r\n"
				+ "kldcmlddhzthreethree2ndzqcmlsthree9sevennine\r\n" + "tmxcpqchmqhzbjhkrpjtq217four\r\n"
				+ "2twogssdgqxtwotwo157\r\n" + "twotwo8eightsix\r\n" + "91gcvsfbxnr2\r\n"
				+ "btngjhhlpnqthreesixtwo1onejrnfxldzvx2eightwovxj\r\n" + "9eightsixsixtwonineninefive\r\n"
				+ "ninethreeeightxlx3bcfdvqct\r\n" + "5krhtdqfpc5pq\r\n" + "four6xzqs91ninetzhpjdtdkxxthzhp\r\n"
				+ "ponefourksmmg5qqnldbdbbrtlxtnnr\r\n" + "four3rc\r\n" + "sixfiveone58nine\r\n" + "ljdbmmlgg7\r\n"
				+ "six5fq\r\n" + "5three3sevenhxlsix4bkkbsfdsgnncf\r\n" + "twofivefcfb6\r\n"
				+ "mtgtkrrxhnine7zbqzdnonethreej\r\n" + "twoonesevenscpqxpmxeightjgbfour7\r\n" + "5gfcknine\r\n"
				+ "fiveeightseven9\r\n" + "foureighthcstwonxrjflrbzpfourfive5\r\n" + "9cxm\r\n"
				+ "95rjzhthree7sevennineninefour\r\n" + "7six9zghtzslldb2ksfrcrntjfjcq\r\n" + "2seven9nine\r\n"
				+ "86tncfxmg26\r\n" + "sevenfivesix2eight\r\n" + "634ldmgqdntcbeightone\r\n"
				+ "3vxvqbhjgjv1skrseven\r\n" + "22one\r\n" + "ntfsixone4zrjglkone8pvgqrnnppsxxbqh\r\n"
				+ "foureight8rrrxbt\r\n" + "mmkpqzgbfn4ljdq8onekz\r\n" + "856six8three1\r\n" + "onez766\r\n"
				+ "42eightfivejzbpgl2crltttkhfx\r\n" + "4eightlpksrlkjzpjxh7\r\n" + "five6onefive6\r\n"
				+ "seven1eightxtf\r\n" + "txdczfnngfxsix4\r\n" + "fivezvkcjczgz1gfpsdspsm45l\r\n"
				+ "4gvdvlzxninedfndgfkdsixncfour\r\n" + "2two915sixrqjksjr\r\n"
				+ "cbjhntsevensixfivefgpzzkgkt7pkmggrptwo\r\n" + "jplfnvvgls4cnvqtkjffcqlfkxqm9zvzvsptkfive\r\n"
				+ "7sevenvqbvjrpnglcxsbqxttfdrv\r\n" + "57sevensix\r\n" + "2seven65smgpnfbm4pjbpq\r\n"
				+ "sevenhsix31drcreight\r\n" + "9fivejtbqkmkf41xfninethreetwo\r\n" + "threeeight7sixnine\r\n"
				+ "threeeightsevenseven8\r\n" + "four3qrz19sixmvkrhjbb5\r\n" + "mtfbjrknlrtwo36eightzkslznj\r\n"
				+ "kndkhvzsghsdqpfonekdqjfszhv6hmrgbf5\r\n" + "gbxjrvh27five675htszone\r\n" + "6rlqppzkcsg53two\r\n"
				+ "sevenxnrnmrh3cpllvxsdvd9\r\n" + "gvtrgstx6xbpgpjthreeeight\r\n" + "hlzvszhsix4\r\n"
				+ "dtxjcxfx7spkprqgn\r\n" + "7five6nineseven\r\n" + "6ntctkrjdvl1pgjhm\r\n" + "qreightwo395\r\n"
				+ "nineone4eightsixkt3four\r\n" + "19five44eightrtnseven\r\n" + "1v6jskjjkzjthree\r\n"
				+ "fouroneeightfivenjpcn8ggtvz\r\n" + "rhtjdxdljht919five3\r\n" + "sixsevenktqxltbhseven28\r\n"
				+ "26ffncztbln\r\n" + "2eightsevenstv84319\r\n" + "jrqhbkj93tmrgfgtlffour97eight\r\n" + "84two9five\r\n"
				+ "27seven86six9\r\n" + "nxsgbzvlkm9six5six1\r\n" + "five3fxmeightfourthree66\r\n"
				+ "1nineeight2one\r\n" + "tbfvqssbxl1meightsevenpbk\r\n" + "8sixthreexnpvk9lgjhpzeight\r\n"
				+ "qvchcvkkgsbeightzhkgxjnine1\r\n" + "4tkcd1threesix3\r\n" + "fjmnhf9nine9kmmeight535\r\n"
				+ "five9nrvxkhnfour\r\n" + "2eightqdmjsninej\r\n" + "764nine1two\r\n" + "hzcxjs8foursb\r\n"
				+ "1sevenfivejlcn\r\n" + "2dzrvmnd9\r\n" + "nine8j9qgfivethbxfcvsixthree\r\n" + "1threes\r\n"
				+ "fivebhcl8five\r\n" + "6nrrm\r\n" + "three7fourdr\r\n" + "czqkm8qmbpzbbfour5seventwoczrj9\r\n"
				+ "krrjcbqltjfourfive1one7vhzftwo\r\n" + "vsjxsffrrpz3jmrgbcbjh\r\n" + "19sevenvlfndx2onetwos\r\n"
				+ "fourrshljvhgv18ninenbgfour\r\n" + "h2sixgdlxbcqjmz23\r\n" + "btrhktjxdnvckdc5dz\r\n"
				+ "fbzrcltwo12\r\n" + "sevenfour8fjgvsqk29pgfpzsmj\r\n" + "two5fjpdjtqttt36\r\n"
				+ "eightljvvhplp5nine\r\n" + "53eightrptfckvfczseveneightsevenqmxjpvhgnfb\r\n"
				+ "1jtngmjtpftgzzdmjfzhmtxf\r\n" + "pgphqgqvjzfeight67\r\n" + "ntqfktninefivebfrthreenine8\r\n"
				+ "fthfnml152zqseven1zvsix\r\n" + "six9sixthree9zsrzpxnvqp7\r\n" + "xfqjxgjtzf19nzkdfourtwo\r\n"
				+ "jqntpbdlpsrhsfbvsevenjgxhkcq5one\r\n" + "1fivevstjfourf\r\n"
				+ "prdvlvpzjxrtmdfoursevenfive3hxvblpmkvh\r\n" + "dzjdfive7four1eight95\r\n"
				+ "7ql1nine1threetwosjv\r\n" + "twonine3four\r\n" + "6dbjxsbqntbhrfsxkl6six4eighttwotbztgzxtsk\r\n"
				+ "two9bqbnfdn5\r\n" + "8frt3vcd8h\r\n" + "fhnrjsixthree3\r\n" + "pfddphghh41\r\n" + "sixfive1151\r\n"
				+ "6six9one8rrjvpptljmbssk5cprgg\r\n" + "49ljkjvjcbbthreesevenrqhvmtspftwo5\r\n" + "nine8615qtxm8\r\n"
				+ "f96five\r\n" + "9sbvxpqjhpjeightjxvbxs\r\n" + "cvssllqx32\r\n"
				+ "4lbgdsrftqcpsbscvmkhonezrfourtmpnnms5kzrv\r\n" + "7four5761seven\r\n" + "dktmlnzhpqcnhgk5\r\n"
				+ "cgzgckzxcrthlb27tcfourfiverggslx\r\n" + "43eightlpcgtvx\r\n"
				+ "szkqjfmsixthreegffszqhhninefive4gdgn1\r\n" + "rhfzbnczlzjjfskg838\r\n" + "pkfoneight1five3five\r\n"
				+ "39sixnineeight6\r\n" + "hzjpqnmtndfive6rpkgcpbvx3two1\r\n" + "9nine3five373\r\n"
				+ "kxccthreeninefhcvzh36five\r\n" + "three5mqnll1mtgbfhr\r\n"
				+ "seven5tg4eightcctnzthldreightsctgkshdgr4\r\n" + "six4fivefoureight3\r\n" + "qthree7\r\n"
				+ "4threethreetwotwothree1lvkskqgn\r\n" + "69lczgone8frk\r\n" + "68mhcnineeight5zncqz5\r\n"
				+ "eightbsjvcjnn7fourfive4seventhree\r\n" + "five9eight\r\n" + "one4four5four8three\r\n"
				+ "fivesnkkldmjxfgnqrmcjtkeightgsb8\r\n" + "sixscmqtfourgjzxmtcqmt2zgnkzspb73\r\n"
				+ "7fmdrpbeight151stdxxz4\r\n" + "teighteight1557twojkccnlsgxp\r\n" + "sevenmhkptflv1\r\n"
				+ "ntrlqjtxjqcxltg138\r\n" + "one9zpthree9\r\n" + "two7mtdj69\r\n" + "tclxbdeightonedtjsdbone17\r\n"
				+ "5173\r\n" + "q8ninethree86\r\n" + "2eight5one1seven\r\n" + "9onexcckgdxb\r\n" + "l1jtwo\r\n"
				+ "ktfnfjm4\r\n" + "7lxcrfpvxggfkpfnhjmm36mjslmhtfpmeightfiveseven\r\n" + "bvhzdf74onelhptjshq\r\n"
				+ "eight3srvbqxmcnthree\r\n" + "fivesix2ptjbknone\r\n" + "vggmbmqspdj7six45eightfpglndqmsm\r\n"
				+ "eightsixcfour2\r\n" + "kctpnpdbsfour49zncpnxbrzvqgmm\r\n" + "7nine8seven446fourfour\r\n"
				+ "dkmt1pdpz\r\n" + "eight6xthvzjcjoneone6five\r\n" + "pzpvrvbbrbdsdbh8vonemkntqnrpn\r\n"
				+ "1xbvsmqbmbjfeightsjsr\r\n" + "threebfcsllrone74tfdmrjnine4vhfrv\r\n" + "5pt6onebrknnstfcn999nine\r\n"
				+ "hz8vntdnmvtvnine\r\n" + "cgzxctckcvpvdg24hrdztmqctqmqkjbjjgl\r\n"
				+ "pbkmkcdfqsxgtprrpgprfgk96sevenzxsbjklsbrsmbeight\r\n" + "sevenrqfourdxqnnlj89rnine8\r\n"
				+ "ninepqldpssh9h\r\n" + "5bjdnine8threefour\r\n" + "1onenineeightmnglcrd\r\n"
				+ "xjsmppqm56seven6qqdsgpxkkd\r\n" + "six79fourfour1\r\n" + "2jrdzvmfone2six8\r\n"
				+ "sevennssvhnpxkl3dsdqlhqxt3xkpqnine\r\n" + "foureightone1onesixnqlrkndqzf\r\n"
				+ "742five25ninethree\r\n" + "onexc87gbrgsdzdxqvqfns\r\n" + "43zrsfzzsgm4fivezqxxztkp\r\n"
				+ "qvdnfvjlhlmznine1twothree\r\n" + "8hdpjzkzblbcjfcl5ktdjfoursixfour8\r\n" + "twofive7phqgtv\r\n"
				+ "six7ftkmlzfx\r\n" + "4sixsevensix8\r\n" + "1qmnxhfjsrq\r\n" + "3fiverfqqq58two\r\n" + "sbqhm6\r\n"
				+ "9xxtone6\r\n" + "ln5vphjcpqhqqzdmpj\r\n" + "sixsixcvnkvvrq3vrlgfvzbf\r\n"
				+ "8qkmsvcgninebfnsgmvk\r\n" + "ninemjsbpppdmknqhjkvcqkq1four8fourseven\r\n"
				+ "sixsksgflz3fiveoneqmrk9\r\n" + "945cskxxdtnt42\r\n" + "ninesixxsfmcxkfour9gfmgthree\r\n"
				+ "sixxgskmzdpsvlxb8five2\r\n" + "6hhqdfbjthreeonefour\r\n" + "4onemzcgbh\r\n" + "onesix1five\r\n"
				+ "3sevenhtqtbpp5seventrrlpfmg\r\n" + "65fbcsix\r\n" + "8rtghmdsfjqv554\r\n"
				+ "1cbnhbdrczvmfiveplsdjq5eight\r\n" + "threeninemqfbrtlbpc85three62\r\n" + "four88fourjttl23\r\n"
				+ "onefivejndtjrgkqfmzrlqv69twoneqj\r\n" + "tworzgmq434qtlqtlfqdb2twofour\r\n"
				+ "g74sltkbkzgmthreegscb6four\r\n" + "eightzgshcpeight5one\r\n"
				+ "fqprbftzmjlmdr4jssixfrfgsrggzhgxktqr1\r\n" + "kdzzccthree8szbzqtq\r\n"
				+ "threefourcbnjx6vfbgrcmtnine39\r\n" + "eight7jscjxtvxxbbc\r\n" + "61tstktfive\r\n" + "2threeseven\r\n"
				+ "rxsfrxqlmt9\r\n" + "zqptzffzmf9\r\n" + "b4eightthreep7six\r\n"
				+ "onethreebvnqhkdzfkbjrgnjdtvzgv7sevenrhp\r\n" + "sevensixnndcjznctg1\r\n" + "m2\r\n"
				+ "15sixvmsqnsmjv7\r\n" + "242\r\n" + "25kvtgjnxtk43eightczvl8\r\n"
				+ "eight8sixthreelcfddgn1hzqxjfvtjzqpkzdltdpjb\r\n" + "eightfiveonerxz1\r\n"
				+ "mphmgxtqjlxjkx6rzprj1hrbtmnteight\r\n" + "jldrhxvgghbrv1\r\n" + "15fourrfzncjlgnineeightxhnvv\r\n"
				+ "566three1fbs97\r\n" + "7pqmgdsix98fiveone\r\n" + "6qqccfgxhbhdhjzmnqqqmb\r\n"
				+ "five1onepxvdqht2sevenrggfhmtwocmmfxplbmp\r\n" + "cnine2nineeight741\r\n"
				+ "kcggzltqv9trcznjzfkmbfrfqsvvzsfnlh\r\n" + "jttwone6dreightssfptmbc\r\n" + "3blslthreetmtwo83\r\n"
				+ "78965rjgchhgll\r\n" + "5ljmbjqk7hgjdmtgxpzs\r\n" + "twosmk3two4fiveeighttwo\r\n"
				+ "qttftkrmrpscczdtxkcfournineztkkfour1\r\n" + "71flmtrrssgcrxlktdmpbkh\r\n" + "vvbmqjh33soneightrg\r\n"
				+ "3hlzmdpmzrrfqczv\r\n" + "seven8twoxtzjhq\r\n" + "64h73jvqjzlfcfdfour\r\n" + "sixznbkx66spzg\r\n"
				+ "dtseven6\r\n" + "seventqxtnkrvv1sixseven\r\n" + "cgtshp1\r\n" + "4nine8\r\n"
				+ "1kptdlhbsixthreeghpgbjjr\r\n" + "pk7four\r\n" + "7hbdflbcxdfivetwo\r\n" + "eightzrzcrnlkd2hrdpl\r\n"
				+ "twodpsix9fivegkdkgtqlsix5four\r\n" + "4gfgvsevenmgzkpdsix4\r\n" + "3eightqlg29\r\n"
				+ "6fqvzgdbmgjl57eight1nineeight\r\n" + "two8xpqlfp3njzdfivecvx2\r\n" + "gbtwoneftrjc733four\r\n"
				+ "6gqrfzrqnthreeseven4sevenltfpfour2\r\n" + "gtgnjsixdxt4five\r\n" + "mmvrthqbkvvl37\r\n"
				+ "3one4fourtpspnczvvbvlrthxc\r\n" + "2eightjqmjqkninecmcfkpvvxl\r\n"
				+ "fourninethreethreebqvvzd6eightwor\r\n" + "7four1gbnjmmbp1sevensztfrvzx5\r\n"
				+ "6one5hcdqtfkfzbl54five\r\n" + "93bnghqnine\r\n" + "cxjvtgmgd7qxqxmxv\r\n" + "6538three6threehvqx\r\n"
				+ "95sixseventwoone\r\n" + "one86nrfddkxnlgvglqbdxfnf6nine4\r\n" + "8zltdpcmctqkhhnxgcxsbphxbksix3\r\n"
				+ "rrdp4psctpgdpm61eight6\r\n" + "cxgvfqhvsevenrpg8threepfqxphrjkr\r\n" + "fivemnsjxdmhqkzhxv4\r\n"
				+ "5knvlqvr1fiveqfpjlqltwokjf\r\n" + "threeonegrxgzsvdhkdcmzvfpseven5zmfiveseven\r\n"
				+ "eighteight717pxblll5sevensix\r\n" + "2cnhcmftwosix\r\n" + "zzbdfnine3x55\r\n" + "one485ninecknv\r\n"
				+ "7onesixonesrptdsixnine8eight\r\n" + "9fourtwo9kmjmbdnnvjjfgxdc\r\n"
				+ "foureightonespxsprvxpmgqqcdtz5r9\r\n" + "39hzsklqnzpfivepsfjhkpbpgvf\r\n"
				+ "7five7threevqjbnthree9ccv\r\n" + "qlnoneightfnineninetfdmb8msixcxcmjxpvfr\r\n"
				+ "sixeight2xflfivesix\r\n" + "jxxzbnine5tlhzrzq54\r\n" + "6eight7311\r\n"
				+ "8twontzkqkdg6ninesixzbzone6\r\n" + "eightsixfournine9\r\n" + "jmrd4\r\n"
				+ "78threefivesixseven8gfc\r\n" + "rnmcgvmponeeighthxn1\r\n" + "seven682mdxrvzfshseventvpgvv\r\n"
				+ "eight5jftlfcbkfr\r\n" + "four4seven3\r\n" + "4nsmkvsxc22tj\r\n" + "three4435\r\n"
				+ "563threesixtwo5six\r\n" + "qxlzsgvkbh4\r\n" + "xoneightsixfourhlrttrld85onetwotfdx\r\n"
				+ "7dvlkcphhrdrzttqn2ztxvdbhdhtplmcbhphxnvg\r\n" + "hfzd59nineonexznhg\r\n" + "onetwo29threex\r\n"
				+ "3four9eight\r\n" + "jcqprfrm6nmzplggbrnine\r\n" + "kone8\r\n"
				+ "hgn9pkrxmrtmtwofsfdmbgnmsfourone\r\n" + "8pljqhtm\r\n" + "4eight6fivetwohbrxgtbb6nfive\r\n"
				+ "hgdnxvkhghfnbvgsqxn39eighteight\r\n" + "tzcsdqkvkhvcrngeight226rvvz1xkblchlg\r\n"
				+ "9qlpvsvdkxgbsixhnxfrcfmx6seven4one\r\n" + "9bcppqvxt7eight3five\r\n"
				+ "5tnmcnrlsnqpkrfprtwonm2four\r\n" + "8eightndzgrtfgpm25tsdcjvckninebchlrd\r\n"
				+ "9sxjbgrvtblnxfphqsix571df\r\n" + "eightckd32oneightk\r\n" + "twotkvsixoneqnzjd2mnhhp\r\n"
				+ "two3l5sixfivecgkr2\r\n" + "nine4two\r\n" + "964five\r\n" + "seventmxhtjnbmj7nlkmbgmbxbhseven\r\n"
				+ "99bgdpvhninesix4threeeighteight\r\n" + "1xhzbjtmfcpd8lqzsthreexxjvbhpfszh\r\n"
				+ "five4oneqnponep31\r\n" + "xlzctwonine5mxfive\r\n" + "8hjrqxseventwoqsfive8\r\n"
				+ "four1hcqfdvonefpfhxmssnn6\r\n" + "zmhs3sevenndfx795\r\n" + "fourkrlnine1\r\n"
				+ "four8mljmjmfpjscckqmxjhjnine43\r\n" + "2five5threegqmgkqm3three7\r\n" + "8fgnkjssix\r\n"
				+ "twoonejqnfphmf77z2threebsp\r\n" + "57pstfv1nine58\r\n" + "6fivetbvnnpb\r\n" + "1331gnrbthgn\r\n"
				+ "2nxpxpcbzdbgnhhrskcdrsix\r\n" + "onegdq85\r\n" + "fourcmjlrdtstwo81tpbnttcntnineoned\r\n"
				+ "jrqfmvleight2ninetblfzlhnsjhdrpltnt\r\n" + "nineqzp8\r\n" + "19qseven\r\n"
				+ "fourmmgfj68pgdgvfour3\r\n" + "twovkfour9five2\r\n" + "1cmtgkdn1\r\n" + "6sixsix\r\n"
				+ "seven9sixnine\r\n" + "4vbhqnqsdvfour1four4ftfvpsm\r\n" + "dsbqseven9gshsnxxvf4ninez\r\n"
				+ "2jqpdmlt\r\n" + "seven759\r\n" + "threecxsbfourtwocnfbzkxgfb7sixeight8\r\n" + "8b26twotwo\r\n"
				+ "7rv4five174\r\n" + "ninegdjrbzjk97\r\n" + "two1ninesix\r\n" + "dmr96\r\n"
				+ "dpzmhthreesevensixxhqrmvlgkpmlmtm1\r\n" + "5191ninetwopbbmkf6\r\n" + "663nine331nine\r\n"
				+ "4gjhqpfivesevens\r\n" + "7pmfk29dxhqgmkgxthhvsztvfour\r\n" + "2onenine\r\n"
				+ "lmftjxtjcfour3hjqgkcd186\r\n" + "twovgrrxgdj7238lvfr\r\n" + "7vnsklc\r\n"
				+ "6sixfive9nljzpcsxzjknkjxknbjsfd\r\n" + "four985veight49c\r\n" + "2grvszbbkqjpfmvqcrktvvl\r\n"
				+ "qvrscfptmr9934jx51\r\n" + "58\r\n" + "xfqzrsj5one\r\n" + "njdrlfxmrmmxtrsccgrpjcfmf25\r\n"
				+ "ninesix1\r\n" + "fivevnfvfpsnxcd9eightthree\r\n" + "hldsrqrjtb6onehtleight2three\r\n"
				+ "six3three\r\n" + "6sevenfour\r\n" + "sevenrvchgqxpbm392zvsncffrhnine\r\n"
				+ "796fourtwo3frkdqzgtwo4\r\n" + "ninexrxf5rjcqxqxkktfrx75four\r\n"
				+ "sevenonetpfiveqpcgsnmqqkrcnmctrclptd6\r\n" + "kgrnm6816pcxqnqd6gvgcsxxrs\r\n"
				+ "one9rvzvlrnzhbnnknxfiveeightwols\r\n" + "71gxxrzbzgd65\r\n" + "nzm58972one49\r\n"
				+ "626hljmxrkscqsxhzm\r\n" + "eightss6fivetngplspntpmsrdpbk\r\n" + "3nine3\r\n" + "five4one\r\n"
				+ "jglzllhf1cl683\r\n" + "5eight34sckhhxrtwonem\r\n" + "eightksevenmgvhczgmqtwo1\r\n"
				+ "dpjfj4znzjznttwo\r\n" + "gsfbsz67threeccjtsg\r\n" + "six76sixsevencqtninefour\r\n"
				+ "sth3sndpsvnx4\r\n" + "two1mndnzjonemlvmlfive3\r\n" + "zkqzhdt2rtlpf\r\n" + "eight8951five6\r\n"
				+ "1qxfvkbmtqvrnztnrztplqldhrmdpgtvcggsixflknn\r\n" + "3fgldgs6six182\r\n"
				+ "ptsrdvvzhfourmgfqseven51klvfqnine\r\n" + "kbktwo4lmkmseven1\r\n" + "gkhpvkeightsixronethreeone2\r\n"
				+ "8six5\r\n" + "frqhlvzrjrxfive2three5g\r\n" + "6crprnxzzvktwosixl\r\n"
				+ "fgc1three9pszkbrhdpmmqnkvbsrttgfjpxg\r\n" + "9twoseven4kvtjxd\r\n" + "7five1onetwo22\r\n"
				+ "7pdjjjfcmq26four\r\n" + "3five4two1dbqztzfxrxfdhh\r\n" + "nzgtvl4tvseven\r\n"
				+ "8qvcrbdvjfqvdsjlfltlzfoursevenoneeightbmvv\r\n" + "sixfconesix6three1sixsix\r\n"
				+ "eightone9nbdrkonenine8\r\n" + "3two5lbrb43nine7\r\n" + "foursix5eightfivezvnbsevenjcrzhxdzfb2\r\n"
				+ "jmgnfive7ffglffpjlvbtvl935zz";

		String input2 = "asdf1234kjh5asdf";
		
		String regex = "\n";
		String[] listInput = input.split(regex);
		List<Character> numbers = Arrays.asList('0','1','2','3','4','5','6','7','8','9');		
		
		List<String> lineNumbersCombined = new ArrayList<>();
		for (String s : listInput) {
			char[] lineNumbers = { ' ', ' ' };
			char found = ' ';
			for (char c : s.toCharArray()) {
				if (numbers.contains(c)) {
					found = c;
				}
				if (lineNumbers[0] == ' ') {
					lineNumbers[0] = found;
				}
			}
			if (lineNumbers[0] != ' ') {
				lineNumbers[1] = found;
			} else {
				lineNumbers[0] = found;
				lineNumbers[1] = found;
			}
			lineNumbersCombined.add(new String(lineNumbers));
		}
		
		
		
		int sum = lineNumbersCombined.stream().mapToInt(Integer::parseInt).sum();
		
		System.out.println(sum);
		
	}
}