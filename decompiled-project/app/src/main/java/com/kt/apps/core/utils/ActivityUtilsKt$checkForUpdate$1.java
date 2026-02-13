package com.kt.apps.core.utils;

import Db.q;
import W1.G;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import cc.E;
import cn.pedant.SweetAlert.SweetAlertDialog;
import com.kt.apps.core.update.AppUpdateRepository;
import com.kt.apps.core.update.UpdateDTO;
import com.kt.apps.core.update.UpdatePriority;
import com.kt.apps.media.xemtv.beta.R;
import y9.AbstractActivityC2461d;

@Jb.e(c = "com.kt.apps.core.utils.ActivityUtilsKt$checkForUpdate$1", f = "ActivityUtils.kt", l = {198}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ActivityUtilsKt$checkForUpdate$1 extends Jb.i implements Rb.e {
    final /* synthetic */ G $this_checkForUpdate;
    final /* synthetic */ AppUpdateRepository $updateRepository;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityUtilsKt$checkForUpdate$1(AppUpdateRepository appUpdateRepository, G g, Hb.d<? super ActivityUtilsKt$checkForUpdate$1> dVar) {
        super(2, dVar);
        this.$updateRepository = appUpdateRepository;
        this.$this_checkForUpdate = g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$2(E e2, DialogInterface dialogInterface) {
        AbstractActivityC2461d abstractActivityC2461d = e2 instanceof AbstractActivityC2461d ? (AbstractActivityC2461d) e2 : null;
        if (abstractActivityC2461d != null) {
            abstractActivityC2461d.r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$4(SweetAlertDialog sweetAlertDialog, E e2, DialogInterface dialogInterface) {
        sweetAlertDialog.getButton(R.id.confirm_button).requestFocus();
        AbstractActivityC2461d abstractActivityC2461d = e2 instanceof AbstractActivityC2461d ? (AbstractActivityC2461d) e2 : null;
        if (abstractActivityC2461d != null) {
            abstractActivityC2461d.t();
        }
    }

    @Override // Jb.a
    public final Hb.d<q> create(Object obj, Hb.d<?> dVar) {
        ActivityUtilsKt$checkForUpdate$1 activityUtilsKt$checkForUpdate$1 = new ActivityUtilsKt$checkForUpdate$1(this.$updateRepository, this.$this_checkForUpdate, dVar);
        activityUtilsKt$checkForUpdate$1.L$0 = obj;
        return activityUtilsKt$checkForUpdate$1;
    }

    @Override // Rb.e
    public final Object invoke(E e2, Hb.d<? super q> dVar) {
        return ((ActivityUtilsKt$checkForUpdate$1) create(e2, dVar)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        E e2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.label;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            E e10 = (E) this.L$0;
            AppUpdateRepository appUpdateRepository = this.$updateRepository;
            this.L$0 = e10;
            this.label = 1;
            Object needUpdate = appUpdateRepository.needUpdate(this);
            if (needUpdate == aVar) {
                return aVar;
            }
            e2 = e10;
            obj = needUpdate;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e2 = (E) this.L$0;
            com.bumptech.glide.c.c0(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        q qVar = q.f3365a;
        if (booleanValue) {
            UpdateDTO lastUpdateConfig = this.$updateRepository.getLastUpdateConfig();
            if (lastUpdateConfig == null) {
                return qVar;
            }
            if (lastUpdateConfig.getUpdatePriority() == UpdatePriority.FORCE.getValue()) {
                ActivityUtilsKt.startDownloadUpdate(this.$this_checkForUpdate);
            } else {
                SweetAlertDialog showCancelButton = new SweetAlertDialog(this.$this_checkForUpdate, 0).showCancelButton(false);
                showCancelButton.showContentText(true);
                showCancelButton.setCancelable(true);
                showCancelButton.setContentText("Đã có bản cập nhật mới. Cập nhật phiên bản mới ngay");
                showCancelButton.setTitleText("Cập nhật ứng dụng");
                showCancelButton.setConfirmText("Cập nhật ngay");
                showCancelButton.setConfirmButton("Cập nhật ngay", new e(this.$this_checkForUpdate, 0));
                showCancelButton.setBackground(new ColorDrawable(0));
                showCancelButton.setOnDismissListener(new f(e2, 0));
                showCancelButton.setOnShowListener(new g(showCancelButton, e2, 0));
                showCancelButton.show();
            }
        } else {
            ActivityUtilsKt.showSuccessDialog$default((Activity) this.$this_checkForUpdate, (Rb.a) null, "Ứng dụng đã được cập nhật phiên bản mới nhất!", (Integer) null, false, 13, (Object) null);
        }
        return qVar;
    }
}
