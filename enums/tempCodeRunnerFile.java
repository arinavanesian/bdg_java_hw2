    public static void main(String[] args) {
      for (Seasons s : Seasons.values()) {
        System.out.println(s.value);
      }
      System.out.println(Seasons.valueOf("WINTER").ordinal());
    }