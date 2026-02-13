package Da;

import cc.E;
import com.kt.apps.core.utils.ActivityUtilsKt;
import pa.AbstractC1866d;

/* loaded from: classes2.dex */
public final class i extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f3321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3322b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, int i7, Hb.d dVar) {
        super(2, dVar);
        this.f3321a = kVar;
        this.f3322b = i7;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new i(this.f3321a, this.f3322b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        i iVar = (i) create((E) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        iVar.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        k kVar = this.f3321a;
        AbstractC1866d abstractC1866d = (AbstractC1866d) kVar.o0();
        abstractC1866d.f23231G.append(String.valueOf(this.f3322b));
        String obj2 = ((AbstractC1866d) kVar.o0()).f23231G.getText().toString();
        if (obj2.length() > 0 && Integer.parseInt(obj2) >= 1000) {
            ActivityUtilsKt.showErrorDialog$default(this.f3321a, null, "Số kênh quá lớn, vui lòng chọn số kênh nhỏ hơn 1000", "Số kênh không hợp lệ", null, null, false, false, null, null, 441, null);
            ((AbstractC1866d) kVar.o0()).f23231G.setText("");
        }
        return Db.q.f3365a;
    }
}
