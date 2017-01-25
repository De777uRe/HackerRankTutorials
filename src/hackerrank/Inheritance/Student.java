/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Inheritance;

/**
 *
 * @author willi
 */
class Student extends Person{
	private int[] testScores;
        
        Student(String firstName, String lastName, int id, int scores[]) {
            super(firstName, lastName, id);
            testScores = scores;
        }
        
        public char calculate() {
            int gradeSum = 0;
            
            for (int i = 0; i < testScores.length; i++) {
                gradeSum += testScores[i];
            }
            
            int avg = gradeSum / testScores.length;
            
            char grade;
            
            if (90 <= avg && avg <= 100) {
                grade = 'O';
            }
            else if (80 <= avg && avg < 90) {
                grade = 'E';
            }
            else if (70 <= avg && avg < 80) {
                grade = 'A';
            }
            else if (55 <= avg && avg < 70) {
                grade = 'P';
            }
            else if (40 <= avg && avg < 55) {
                grade ='D';
            }
            else {
                grade = 'T';
            }
            
            return grade;
        }
    }
