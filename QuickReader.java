class QuickReader{
  private BufferedReader br;
  private StringTokenizer st;

  public QuickReader(){
    br = new BufferedReader(new InputStreamReader(System.in));
  }

  String next(){
    while(st == null || !st.hasMoreElements()){
      try{
        st = new StringTokenizer(br.readLine());
      }catch(IOException e){
        e.printStackTrace();
      }
    }

    return st.nextToken();
  }

  public int nextInt(){
    return Integer.parseInt(next());
  }

  public float nextFloat(){
    return Float.parseFloat(next())
  }

  public

  public void close() throws IOException{
    br.close();
  }
}
