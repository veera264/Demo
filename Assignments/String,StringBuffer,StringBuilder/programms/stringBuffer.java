package AcccessModifier;


class stringBuffer {

    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer();
        sb.append("Veera");
        sb.append(" Narayana");
        sb.delete(0,5); // it will delete from index 0 to 5
        sb.replace(0,sb.length(),"Mani");  // it will replace with new String
        int length=sb.length();  // this method will give length of the sb
        sb.reverse();  // this method will reverse the string.
        System.out.println(sb);

    }
}
