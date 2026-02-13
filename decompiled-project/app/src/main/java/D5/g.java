package D5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0963d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
import com.google.android.gms.internal.p000authapi.zbc;
import x5.AbstractC2267a;

/* loaded from: classes.dex */
public final class g extends AbstractC0963d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3252a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, int i7) {
        super(AbstractC2267a.f26219a, oVar);
        this.f3252a = i7;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ r createFailedResult(Status status) {
        int i7 = this.f3252a;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0963d
    public final void doExecute(com.google.android.gms.common.api.b bVar) {
        switch (this.f3252a) {
            case 0:
                e eVar = (e) bVar;
                k kVar = (k) eVar.getService();
                f fVar = new f(this, 0);
                Parcel zba = kVar.zba();
                zbc.zbd(zba, fVar);
                zbc.zbc(zba, eVar.f3249a);
                kVar.zbb(102, zba);
                return;
            default:
                e eVar2 = (e) bVar;
                k kVar2 = (k) eVar2.getService();
                f fVar2 = new f(this, 1);
                Parcel zba2 = kVar2.zba();
                zbc.zbd(zba2, fVar2);
                zbc.zbc(zba2, eVar2.f3249a);
                kVar2.zbb(103, zba2);
                return;
        }
    }
}
