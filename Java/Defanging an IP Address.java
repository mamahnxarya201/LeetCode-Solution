class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        // char titik = ".";
        char[] addrchr = address.toCharArray();
        for(int i = 0; i < addrchr.length; i++){
            if(addrchr[i] == '.'){
                sb.append("[").append(addrchr[i]).append(']');
            }else{
                sb.append(addrchr[i]);
            }
            
        }
	return sb.toString();
    }
}