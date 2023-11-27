//package SST;
//
//public class ObjectCore implements ObjectUtility {
//    @Override
//    public boolean isInRange(int range, MapDesignation object1, MapDesignation object2) {
//
//        MapDesignation temp = compareMapDesignations('-', object1, object2);
//
//        if(Math.abs(temp.xDes) <= range && Math.abs(temp.yDes) <= range)
//            return true;
//
//        return false;
//    }
//
//    @Override
//    public MapDesignation compareMapDesignations(char operation, MapDesignation leftTerm, MapDesignation rightTerm) {
//
//        MapDesignation temp = new MapDesignation(0,0);
//        switch (operation){
//            case '-':{
//                temp.xDes = leftTerm.xDes - rightTerm.xDes;
//                temp.yDes = leftTerm.yDes - leftTerm.yDes;
//            }
//            default:{
//                temp.xDes = leftTerm.xDes + rightTerm.xDes;
//                temp.yDes = leftTerm.yDes + leftTerm.yDes;
//            }
//        }
//
//        return temp;
//    }
//}
