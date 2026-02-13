package Y5;

import ac.AbstractC0796a;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzqo;
import com.google.android.gms.internal.measurement.zzra;
import com.google.android.gms.internal.measurement.zzrg;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import jb.InterfaceC1394e;
import o2.InterfaceC1780b;
import rc.AbstractC1958b;
import rc.C1967k;

/* renamed from: Y5.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0658x implements InterfaceC0650t, InterfaceC1780b, InterfaceC1394e, SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0658x f11984b = new C0658x(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C0658x f11985c = new C0658x(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C0658x f11986d = new C0658x(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C0658x f11987e = new C0658x(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C0658x f11988f = new C0658x(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C0658x f11989u = new C0658x(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C0658x f11990v = new C0658x(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11991a;

    public /* synthetic */ C0658x(int i7) {
        this.f11991a = i7;
    }

    public static final boolean a(rc.z zVar) {
        rc.z zVar2 = sc.e.f24367f;
        return !ac.n.S(zVar.b(), ".class", true);
    }

    public static C1967k b(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = i7 * 2;
            bArr[i7] = (byte) (sc.b.a(str.charAt(i10 + 1)) + (sc.b.a(str.charAt(i10)) << 4));
        }
        return new C1967k(bArr);
    }

    public static C1967k c(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC0796a.f12815a);
        kotlin.jvm.internal.l.d(bytes, "getBytes(...)");
        C1967k c1967k = new C1967k(bytes);
        c1967k.f23970c = str;
        return c1967k;
    }

    public static C1967k d(byte[] bArr) {
        C1967k c1967k = C1967k.f23967d;
        int length = bArr.length;
        AbstractC1958b.e(bArr.length, 0, length);
        return new C1967k(Eb.n.S(0, bArr, length));
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        return obj;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    public String toString() {
        switch (this.f11991a) {
            case 14:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    @Override // Y5.InterfaceC0650t
    public /* synthetic */ Object zza() {
        switch (this.f11991a) {
            case 0:
                List list = F.f11304a;
                return zzoy.zzD();
            case 1:
                List list2 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzW());
            case 2:
                List list3 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzB());
            case 3:
                List list4 = F.f11304a;
                return Boolean.valueOf(zzrg.zzb());
            case 4:
                List list5 = F.f11304a;
                return Boolean.valueOf(zzra.zza());
            case 5:
                List list6 = F.f11304a;
                return Boolean.valueOf(zzql.zzc());
            default:
                List list7 = F.f11304a;
                return Boolean.valueOf(zzqo.zza());
        }
    }
}
