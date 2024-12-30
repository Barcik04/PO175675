package zad2;

public class BuildingMaterial {
    private String materialType;
    private String qualityGrade;
    private int quentityInStock;

    public BuildingMaterial(String materialType, String qualityGrade, int quentityInStock) {
        this.materialType = materialType;
        this.qualityGrade = qualityGrade;
        this.quentityInStock = quentityInStock;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getQualityGrade() {
        return qualityGrade;
    }

    public void setQualityGrade(String qualityGrade) {
        this.qualityGrade = qualityGrade;
    }

    public int getQuentityInStock() {
        return quentityInStock;
    }

    public void setQuentityInStock(int quentityInStock) {
        this.quentityInStock = quentityInStock;
    }

    public static boolean isSufficientQuantity(BuildingMaterial arg) {
        if (arg == null) {
            return false;
        }
        return arg.getQuentityInStock() > 100;
    }

    public boolean isSufficientQuantity() {
        return this.getQuentityInStock() > 100;
    }

    @Override
    public String toString() {
        return "material type: " + materialType + "qualityGrade: " + qualityGrade + "quentityInStock: " + quentityInStock;
    }
}


