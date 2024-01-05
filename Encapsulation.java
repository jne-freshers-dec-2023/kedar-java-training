public class Encapsulation {

        public static void main(String[] args){
        
            Encapsulation encapsulation = new Encapsulation();
            double variableOne = 10;
            double variableTwo = 2;
            encapsulation.divisionProcess(variableOne,variableTwo);
            multiplicationProcess(variableOne,variableTwo);
        }

        public void divisionProcess(double variableOne,double variableTwo){

            double finalOutput = variableOne/variableTwo;
            System.out.println(finalOutput);
        }

        public static void multiplicationProcess(double variableOne, double variableTwo){

            double finalOutput = variableOne * variableTwo;
            System.out.println(finalOutput);
        }
    }



