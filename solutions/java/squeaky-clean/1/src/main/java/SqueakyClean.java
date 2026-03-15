class SqueakyClean {
    static String clean(String identifier) {
        char[] arr=identifier.toCharArray();
        StringBuilder build= new StringBuilder();
        for (int i=0;i<identifier.length();i++)
            {
                char c=arr[i];
                if(Character.isWhitespace(c))
                    build.append('_');
                else if(c=='4')
                    build.append('a');
                else if(c=='3')
                    build.append('e');
                else if(c=='0')
                    build.append('o');
                else if(c=='1')
                    build.append('l');
                else if(c=='7')
                    build.append('t');
                else if(c=='-'){
                    i++;
                    build.append(Character.toUpperCase(arr[i]));
                }
                else if (!Character.isLetter(c)){}
                else{
                    build.append(c);
                }
                    
            }
        return build.toString();
    }
}
