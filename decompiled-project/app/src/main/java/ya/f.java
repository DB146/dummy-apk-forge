package ya;

import Db.q;
import W1.C;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import cc.E;
import cc.F;
import cn.pedant.SweetAlert.SweetAlertDialog;
import com.kt.apps.core.update.AppUpdateRepository;
import com.kt.apps.core.update.UpdateDTO;
import com.kt.apps.core.update.UpdatePriority;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import l2.Q;
import y9.AbstractActivityC2461d;

/* loaded from: classes2.dex */
public final class f extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27558a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f27560c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Hb.d dVar) {
        super(2, dVar);
        this.f27560c = jVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        f fVar = new f(this.f27560c, dVar);
        fVar.f27559b = obj;
        return fVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object needUpdate;
        final E e2;
        UpdateDTO lastUpdateConfig;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27558a;
        q qVar = q.f3365a;
        j jVar = this.f27560c;
        try {
            try {
                if (i7 == 0) {
                    com.bumptech.glide.c.c0(obj);
                    E e10 = (E) this.f27559b;
                    AppUpdateRepository appUpdateRepository = jVar.f27567p0;
                    if (appUpdateRepository != null) {
                        this.f27559b = e10;
                        this.f27558a = 1;
                        needUpdate = appUpdateRepository.needUpdate(this);
                        if (needUpdate == aVar) {
                            return aVar;
                        }
                        e2 = e10;
                    }
                    return qVar;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e2 = (E) this.f27559b;
                com.bumptech.glide.c.c0(obj);
                needUpdate = obj;
                if (((Boolean) needUpdate).booleanValue()) {
                    AppUpdateRepository appUpdateRepository2 = jVar.f27567p0;
                    if (appUpdateRepository2 != null && (lastUpdateConfig = appUpdateRepository2.getLastUpdateConfig()) != null) {
                        if (lastUpdateConfig.getUpdatePriority() == UpdatePriority.FORCE.getValue()) {
                            F.B(Q.f(jVar), null, 0, new i(jVar, null), 3);
                        } else {
                            final SweetAlertDialog showCancelButton = new SweetAlertDialog(jVar.i0(), 0).showCancelButton(false);
                            showCancelButton.showContentText(true);
                            showCancelButton.setCancelable(true);
                            showCancelButton.setContentText("Đã có bản cập nhật mới. Cập nhật phiên bản mới ngay");
                            showCancelButton.setTitleText("Cập nhật ứng dụng");
                            showCancelButton.setConfirmText("Cập nhật ngay");
                            showCancelButton.setConfirmButton("Cập nhật ngay", new a(jVar));
                            showCancelButton.setBackground(new ColorDrawable(0));
                            showCancelButton.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ya.d
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    Object obj2 = E.this;
                                    AbstractActivityC2461d abstractActivityC2461d = obj2 instanceof AbstractActivityC2461d ? (AbstractActivityC2461d) obj2 : null;
                                    if (abstractActivityC2461d != null) {
                                        abstractActivityC2461d.r();
                                    }
                                }
                            });
                            showCancelButton.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ya.e
                                @Override // android.content.DialogInterface.OnShowListener
                                public final void onShow(DialogInterface dialogInterface) {
                                    SweetAlertDialog.this.getButton(R.id.confirm_button).requestFocus();
                                    Object obj2 = e2;
                                    AbstractActivityC2461d abstractActivityC2461d = obj2 instanceof AbstractActivityC2461d ? (AbstractActivityC2461d) obj2 : null;
                                    if (abstractActivityC2461d != null) {
                                        abstractActivityC2461d.t();
                                    }
                                }
                            });
                            showCancelButton.show();
                        }
                    }
                    return qVar;
                }
                ActivityUtilsKt.showSuccessDialog$default((C) this.f27560c, (Rb.a) null, "Ứng dụng đã được cập nhật phiên bản mới nhất!", (Integer) null, false, 13, (Object) null);
            } catch (Exception unused) {
                ActivityUtilsKt.showSuccessDialog$default((C) this.f27560c, (Rb.a) null, "Lỗi khi kiểm tra cập nhật. Vui lòng thử lại!", (Integer) null, false, 13, (Object) null);
            }
            return qVar;
        } finally {
            ((pa.i) jVar.o0()).f23239C.setEnabled(true);
            ((pa.i) jVar.o0()).f23239C.setText(jVar.G(R.string.info_check_update));
            ((pa.i) jVar.o0()).f23239C.setIconResource(R.drawable.ic_play_store);
        }
    }
}
