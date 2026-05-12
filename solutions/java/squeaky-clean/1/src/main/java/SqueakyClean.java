class SqueakyClean {
    static String clean(String identifier) {
        String result = "";
        char[] asArray = identifier.toCharArray();
        int kebab = 0;
        for (char ch: asArray){
            if(Character.isWhitespace(ch)){
                result += "_";
            }else if(Character.getType(ch) == Character.DASH_PUNCTUATION){
                kebab = 1;
                continue;
            }else if(kebab == 1){
                result += Character.toUpperCase(ch);
                kebab = 0;
            }else if(Character.isDigit(ch)){
                if (ch == '3'){
                    result += "e";
                }else if(ch == '4'){
                    result += "a";
                }else if(ch == '0'){
                    result += "o";
                }else if(ch == '1'){
                    result += "l";
                }else if(ch == '7'){
                    result += "t";
                }
            }else if(Character.getType(ch) == Character.OTHER_PUNCTUATION || Character.getType(ch) == Character.CURRENCY_SYMBOL){
                continue;
            }else{
                result += ch;
            }             
        }
        return result;
    }
}
