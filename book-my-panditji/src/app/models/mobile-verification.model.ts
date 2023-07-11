export class MobileVerification {
     mobile:string="";
     otp:string="";

    getMobile():string{
        return this.mobile;
    }
    getOtp():string{
        return this.otp;
    }
    setMobile(mobile:string){
        this.mobile=mobile;
    }
    setOtp(otp:string){
        this.otp=otp;
    }
}
