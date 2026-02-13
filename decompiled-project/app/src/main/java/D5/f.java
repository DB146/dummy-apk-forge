package D5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.internal.p000authapi.zbc;

/* loaded from: classes.dex */
public final class f extends zbb implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f3251b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i7) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.f3250a = i7;
        this.f3251b = gVar;
    }

    @Override // D5.j
    public void E(Status status) {
        switch (this.f3250a) {
            case 1:
                this.f3251b.setResult(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // D5.j
    public void c(Status status) {
        switch (this.f3250a) {
            case 0:
                this.f3251b.setResult(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i10) {
        switch (i7) {
            case 101:
                zbc.zbb(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                c(status);
                break;
            case 103:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                E(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
