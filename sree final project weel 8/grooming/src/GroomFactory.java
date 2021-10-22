public class GroomFactory {
    public Groom getGroom(String groomType){
        if(groomType==null){
            return null;
        }else if(groomType.equalsIgnoreCase("hair")){
            return new Hair();
        }else if(groomType.equalsIgnoreCase("makeup")){
            return new Makeup();
        }else if(groomType.equalsIgnoreCase("nail")){
            return new Nail();
        }else if(groomType.equalsIgnoreCase("shoes")){
            return new Shoes();
        }else if(groomType.equalsIgnoreCase("teeth")){
            return new Teeth();
        }else if(groomType.equalsIgnoreCase("uniform")){
            return new Uniform();
        }
        return null;
    }
}
