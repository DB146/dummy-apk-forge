package A9;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.NavDrawerView;

/* loaded from: classes2.dex */
public final /* synthetic */ class A1 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavDrawerView f736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f737c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ImageView f739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextView f740f;
    public final /* synthetic */ MenuItem g;

    public /* synthetic */ A1(NavDrawerView navDrawerView, int i7, View view, ImageView imageView, TextView textView, MenuItem menuItem, int i10) {
        this.f735a = i10;
        this.f736b = navDrawerView;
        this.f737c = i7;
        this.f738d = view;
        this.f739e = imageView;
        this.f740f = textView;
        this.g = menuItem;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        switch (this.f735a) {
            case 0:
                MenuItem menuItem = this.g;
                NavDrawerView.b(this.f736b, this.f737c, this.f738d, this.f739e, this.f740f, menuItem, z8);
                return;
            default:
                MenuItem menuItem2 = this.g;
                NavDrawerView.a(this.f736b, this.f737c, this.f738d, this.f739e, this.f740f, menuItem2, z8);
                return;
        }
    }
}
