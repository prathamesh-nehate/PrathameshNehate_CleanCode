package subtask1;
class SimpleInterest implements Interest{
    
    Double simpleInterest;

    SimpleInterest(){
        simpleInterest = 0d;
    }

    @Override
    public Double calculateInterest(Double rateOfInterest, Integer principalAmount, Double periodOfInterest) {
        simpleInterest = (rateOfInterest * principalAmount *periodOfInterest)/100;
        return simpleInterest;
    }
}