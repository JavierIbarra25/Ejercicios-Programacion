class Kata {
  public static String countingSheep(int num) {
    
     String resultado = "";
    
     for(int i = 1; i <= num; i++){    
      resultado = resultado + i + " sheep...";
    }
    return resultado;
  }
}
