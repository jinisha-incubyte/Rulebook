package rulebook;

public class Contract {
  private String contractNo;

  private String exceptionComment;

  public String getContractNo() {
    return contractNo;
  }

  public void setContractNo(String contractNo) {
    this.contractNo = contractNo;
  }

  public void setLegal(boolean legal) {
    isLegal = legal;
  }

  private boolean isLegal;
  private boolean has101;

  public boolean isLegal() {
    return isLegal;
  }

  public void setIsLegal(boolean legal) {
    isLegal = legal;
  }

  public boolean isHas101() {
    return has101;
  }

  public void setHas101(boolean has101) {
    this.has101 = has101;
  }

  public String getExceptionComment() {
    return exceptionComment;
  }

  public void setExceptionComment(String exceptionComment) {
    this.exceptionComment = exceptionComment;
  }
}
