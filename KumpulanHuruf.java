public class KumpulanHuruf {

    public static char[] letters = {
            ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
            'z'
    };

    public static int cocokkan(Character huruf) {
        for(var i = 1 ; i < letters.length ; i++ ) {
            if(huruf.equals(letters[i])){return i;}
        }
        return 0;
    }

    private static char numberToLetterTerjemahan(int nomor) {
        for(var i = 1 ; i < letters.length ; i++ ) {

            if(nomor > 0){
                if(nomor == i){
                    return letters[i];}
            }else{
                switch (nomor) {
                    case 0 -> {
                        return letters[26];
                    }
                    case -1 -> {
                        return letters[25];
                    }
                    case -2 -> {
                        return letters[24];
                    }
                    case -3 -> {
                        return letters[23];
                    }
                    case -4 -> {
                        return letters[22];
                    }
                }
            }
        }
        return 0;
    }

    private static char numberToLetterKode(int nomor) {
        for(var i = 1 ; i < letters.length ; i++ ) {

            if(nomor <= 26){
                if(nomor == i){return letters[i];}
            }else{
                switch (nomor) {
                    case 27 -> {
                        return letters[1];
                    }
                    case 28 -> {
                        return letters[2];
                    }
                    case 29 -> {
                        return letters[3];
                    }
                    case 30 -> {
                        return letters[4];
                    }
                    case 31 -> {
                        return letters[5];
                    }
                }
            }
        }
        return 0;
    }

    public static String proses(String message) {

        char[] temp = message.trim().toLowerCase().toCharArray();
        char[] array = new char[temp.length];

        for(var i = temp.length-1 ; i >= 0 ; i--) {
            array[temp.length - i - 1] = temp[i];
        }

        int[] nomorHuruf = new int[temp.length];
        for(var i = 0 ; i < temp.length ; i++) {
            nomorHuruf[i] = KumpulanHuruf.cocokkan(array[i]);
        }

        int[] nomorHuruf2 = new int[temp.length];
        for(var i = 0 ; i < temp.length ; i++) {
            nomorHuruf2[i] = nomorHuruf[i] + 5;
        }

        char[] kode = new char[temp.length];
        for(var i = 0 ; i < temp.length ; i++) {
            kode[i] = KumpulanHuruf.numberToLetterKode(nomorHuruf2[i]);
        }
        return String.valueOf(kode);
    }

    public static String terjemahkan(String kalimat) {

        char[] temp = kalimat.trim().toLowerCase().toCharArray();
        char[] array = new char[temp.length];

        for(var i = temp.length-1 ; i >= 0 ; i--) {
            array[temp.length - i - 1] = temp[i];
        }

        int[] nomorHuruf = new int[temp.length];
        for(var i = 0 ; i < temp.length ; i++) {
            nomorHuruf[i] = KumpulanHuruf.cocokkan(array[i]);
        }

        int[] nomorHuruf2 = new int[temp.length];
        for(var i = 0 ; i < temp.length ; i++) {
            nomorHuruf2[i] = nomorHuruf[i] - 5;
        }

        char[] kode = new char[temp.length];
        for(var i = 0 ; i < temp.length ; i++) {
            kode[i] = KumpulanHuruf.numberToLetterTerjemahan(nomorHuruf2[i]);
        }
        return String.valueOf(kode);
    }
}
