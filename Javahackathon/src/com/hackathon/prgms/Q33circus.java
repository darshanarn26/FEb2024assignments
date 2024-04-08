package com.hackathon.prgms;
import java.util.Arrays;

//A circus is designing a tower routine consisting of people standing atop one another’s shoulders. For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her. Given the heights and weights of each person in the circus, write a method to compute the largest possible number of people in such a tower. EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
public class Q33circus {
	public class CircusTower {

		
	    
		    static class Person implements Comparable<Person> {
		        int height;
		        int weight;
		        
		        public Person(int height, int weight) {
		            this.height = height;
		            this.weight = weight;
		        }
		        
		        @Override
		        public int compareTo(Person other) {
		            if (this.height != other.height) {
		                return Integer.compare(this.height, other.height);
		            } else {
		                return Integer.compare(this.weight, other.weight);
		            }
		        }
		    }
		    
		    public static int maxTowerHeight(Person[] people) {
		        if (people == null || people.length == 0) {
		            return 0;
		        }
		        
		        Arrays.sort(people);
		        
		        int[] dp = new int[people.length];
		        Arrays.fill(dp, 1);
		        
		        int maxTowerHeight = 1;
		        
		        for (int i = 1; i < people.length; i++) {
		            for (int j = 0; j < i; j++) {
		                if (people[i].height > people[j].height && people[i].weight > people[j].weight) {
		                    dp[i] = Math.max(dp[i], dp[j] + 1);
		                }
		            }
		            maxTowerHeight = Math.max(maxTowerHeight, dp[i]);
		        }
		        
		        return maxTowerHeight;
		    }

		    public static void main(String[] args) {
		        Person[] people = {
		            new Person(65, 100),
		            new Person(70, 150),
		            new Person(56, 90),
		            new Person(75, 190),
		            new Person(60, 95),
		            new Person(68, 110)
		        };

		        int maxTowerHeight = maxTowerHeight(people);
		        System.out.println("Largest possible number of people in the tower: " + maxTowerHeight);
		    }
		}

	}


