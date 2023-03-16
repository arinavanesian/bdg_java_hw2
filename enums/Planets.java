package main.java.com.example.enums;

import java.math.BigInteger;

import javax.naming.spi.DirStateFactory;

//Ex1
public enum Planets{
    EARTH(365), SATURN(10759), JUPYTER(4333), 
    URANUS(30687),NEPTUNE(60200), VENUS(225),
    MERCURY(88), MARS(687);
    private final int yearLength;
    private Planets(int yearLength){
      this.yearLength = yearLength;
    }
    public String getName(){
      return this.toString();
    }
    public String getLoweCaseNames(){
      return this.toString().toLowerCase();
    }
    public static void main(String[] args) {
      
      
    }
  }
  //Ex4
  enum PlanetDistance{    
    EARTH(150_000_000), SATURN(1_430_000_000), JUPITER(778_000_000), 
    URANUS(new BigInteger( "2_870_000_000")),NEPTUNE(new BigInteger("4_500_000_000")), VENUS(108_000_000),
    MERCURY(58_000_000), MARS(228_000_000);
    private  BigInteger distanceFromSun;
    private int distanceInt;
    private PlanetDistance(BigInteger distanceFromSuBigInteger){
      distanceFromSun = distanceFromSuBigInteger;
    }
    private PlanetDistance(int distance){
      distanceInt = distance;
    }

  }
