package e6;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.m;
import i1.AbstractC1291b;
import java.util.WeakHashMap;
import y1.K;

/* renamed from: e6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1096a extends AbstractC1291b {

    /* renamed from: a, reason: collision with root package name */
    public m f16805a;

    @Override // i1.AbstractC1291b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i7) {
        v(coordinatorLayout, view, i7);
        if (this.f16805a == null) {
            this.f16805a = new m(view);
        }
        m mVar = this.f16805a;
        View view2 = mVar.f15332a;
        mVar.f15333b = view2.getTop();
        mVar.f15334c = view2.getLeft();
        m mVar2 = this.f16805a;
        View view3 = mVar2.f15332a;
        int top = 0 - (view3.getTop() - mVar2.f15333b);
        WeakHashMap weakHashMap = K.f26642a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - mVar2.f15334c));
        return true;
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, int i7) {
        coordinatorLayout.q(view, i7);
    }
}
