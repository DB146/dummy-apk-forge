package i;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.WeakHashMap;
import o.C1755q0;
import y1.K;

/* renamed from: i.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC1286f extends x implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final C1284d f18070f;

    public DialogInterfaceC1286f(ContextThemeWrapper contextThemeWrapper, int i7) {
        super(contextThemeWrapper, h(contextThemeWrapper, i7));
        this.f18070f = new C1284d(getContext(), this, getWindow());
    }

    public static int h(Context context, int i7) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c2  */
    @Override // i.x, c.DialogC0868l, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int i7;
        int i10;
        boolean z8;
        int i11;
        boolean z10;
        AlertController$RecycleListView alertController$RecycleListView;
        AlertController$RecycleListView alertController$RecycleListView2;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        C1284d c1284d = this.f18070f;
        c1284d.f18046b.setContentView(c1284d.f18067z);
        Window window = c1284d.f18047c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = c1284d.g;
        if (view == null) {
            view = null;
        }
        boolean z11 = view != null;
        if (!z11 || !C1284d.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z11) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c1284d.f18051h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c1284d.f18050f != null) {
                ((LinearLayout.LayoutParams) ((C1755q0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b2 = C1284d.b(findViewById6, findViewById3);
        ViewGroup b10 = C1284d.b(findViewById7, findViewById4);
        ViewGroup b11 = C1284d.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c1284d.f18059r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c1284d.f18059r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b10.findViewById(android.R.id.message);
        c1284d.f18063v = textView;
        if (textView != null) {
            SpannableString spannableString = c1284d.f18049e;
            if (spannableString != null) {
                textView.setText(spannableString);
            } else {
                textView.setVisibility(8);
                c1284d.f18059r.removeView(c1284d.f18063v);
                if (c1284d.f18050f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c1284d.f18059r.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(c1284d.f18059r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(c1284d.f18050f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b10.setVisibility(8);
                }
            }
        }
        Button button = (Button) b11.findViewById(android.R.id.button1);
        c1284d.f18052i = button;
        com.google.android.material.datepicker.k kVar = c1284d.f18044F;
        button.setOnClickListener(kVar);
        if (TextUtils.isEmpty(c1284d.j)) {
            c1284d.f18052i.setVisibility(8);
            i7 = 0;
        } else {
            c1284d.f18052i.setText(c1284d.j);
            c1284d.f18052i.setVisibility(0);
            i7 = 1;
        }
        Button button2 = (Button) b11.findViewById(android.R.id.button2);
        c1284d.f18053l = button2;
        button2.setOnClickListener(kVar);
        if (TextUtils.isEmpty(c1284d.f18054m)) {
            c1284d.f18053l.setVisibility(8);
        } else {
            c1284d.f18053l.setText(c1284d.f18054m);
            c1284d.f18053l.setVisibility(0);
            i7 |= 2;
        }
        Button button3 = (Button) b11.findViewById(android.R.id.button3);
        c1284d.f18056o = button3;
        button3.setOnClickListener(kVar);
        if (TextUtils.isEmpty(c1284d.f18057p)) {
            c1284d.f18056o.setVisibility(8);
        } else {
            c1284d.f18056o.setText(c1284d.f18057p);
            c1284d.f18056o.setVisibility(0);
            i7 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c1284d.f18045a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i7 != 1) {
                i10 = 2;
                if (i7 == 2) {
                    Button button4 = c1284d.f18053l;
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                    layoutParams.gravity = 1;
                    layoutParams.weight = 0.5f;
                    button4.setLayoutParams(layoutParams);
                } else if (i7 == 4) {
                    Button button5 = c1284d.f18056o;
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                    layoutParams2.gravity = 1;
                    layoutParams2.weight = 0.5f;
                    button5.setLayoutParams(layoutParams2);
                }
                if (i7 == 0) {
                    b11.setVisibility(8);
                }
                if (c1284d.f18064w == null) {
                    b2.addView(c1284d.f18064w, 0, new ViewGroup.LayoutParams(-1, -2));
                    window.findViewById(R.id.title_template).setVisibility(8);
                } else {
                    c1284d.f18061t = (ImageView) window.findViewById(android.R.id.icon);
                    if (TextUtils.isEmpty(c1284d.f18048d) || !c1284d.f18042D) {
                        window.findViewById(R.id.title_template).setVisibility(8);
                        c1284d.f18061t.setVisibility(8);
                        b2.setVisibility(8);
                    } else {
                        TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                        c1284d.f18062u = textView2;
                        textView2.setText(c1284d.f18048d);
                        Drawable drawable = c1284d.f18060s;
                        if (drawable != null) {
                            c1284d.f18061t.setImageDrawable(drawable);
                        } else {
                            c1284d.f18062u.setPadding(c1284d.f18061t.getPaddingLeft(), c1284d.f18061t.getPaddingTop(), c1284d.f18061t.getPaddingRight(), c1284d.f18061t.getPaddingBottom());
                            c1284d.f18061t.setVisibility(8);
                        }
                    }
                }
                z8 = viewGroup.getVisibility() == 8;
                i11 = (b2 != null || b2.getVisibility() == 8) ? 0 : 1;
                z10 = b11.getVisibility() == 8;
                if (!z10 && (findViewById = b10.findViewById(R.id.textSpacerNoButtons)) != null) {
                    findViewById.setVisibility(0);
                }
                if (i11 == 0) {
                    NestedScrollView nestedScrollView2 = c1284d.f18059r;
                    if (nestedScrollView2 != null) {
                        nestedScrollView2.setClipToPadding(true);
                    }
                    View findViewById9 = (c1284d.f18049e == null && c1284d.f18050f == null) ? null : b2.findViewById(R.id.titleDividerNoCustom);
                    if (findViewById9 != null) {
                        findViewById9.setVisibility(0);
                    }
                } else {
                    View findViewById10 = b10.findViewById(R.id.textSpacerNoTitle);
                    if (findViewById10 != null) {
                        findViewById10.setVisibility(0);
                    }
                }
                alertController$RecycleListView = c1284d.f18050f;
                if (alertController$RecycleListView != null) {
                    alertController$RecycleListView.getClass();
                    if (!z10 || i11 == 0) {
                        alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i11 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f12882a, alertController$RecycleListView.getPaddingRight(), z10 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f12883b);
                    }
                }
                if (!z8) {
                    View view2 = c1284d.f18050f;
                    if (view2 == null) {
                        view2 = c1284d.f18059r;
                    }
                    if (view2 != null) {
                        int i12 = z10 ? i10 : 0;
                        View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                        View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                        WeakHashMap weakHashMap = K.f26642a;
                        y1.C.b(view2, i11 | i12, 3);
                        if (findViewById11 != null) {
                            b10.removeView(findViewById11);
                        }
                        if (findViewById12 != null) {
                            b10.removeView(findViewById12);
                        }
                    }
                }
                alertController$RecycleListView2 = c1284d.f18050f;
                if (alertController$RecycleListView2 != null || (listAdapter = c1284d.f18065x) == null) {
                }
                alertController$RecycleListView2.setAdapter(listAdapter);
                int i13 = c1284d.f18066y;
                if (i13 > -1) {
                    alertController$RecycleListView2.setItemChecked(i13, true);
                    alertController$RecycleListView2.setSelection(i13);
                    return;
                }
                return;
            }
            Button button6 = c1284d.f18052i;
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
            layoutParams3.gravity = 1;
            layoutParams3.weight = 0.5f;
            button6.setLayoutParams(layoutParams3);
        }
        i10 = 2;
        if (i7 == 0) {
        }
        if (c1284d.f18064w == null) {
        }
        if (viewGroup.getVisibility() == 8) {
        }
        if (b2 != null) {
        }
        if (b11.getVisibility() == 8) {
        }
        if (!z10) {
            findViewById.setVisibility(0);
        }
        if (i11 == 0) {
        }
        alertController$RecycleListView = c1284d.f18050f;
        if (alertController$RecycleListView != null) {
        }
        if (!z8) {
        }
        alertController$RecycleListView2 = c1284d.f18050f;
        if (alertController$RecycleListView2 != null) {
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f18070f.f18059r;
        if (nestedScrollView == null || !nestedScrollView.f(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f18070f.f18059r;
        if (nestedScrollView == null || !nestedScrollView.f(keyEvent)) {
            return super.onKeyUp(i7, keyEvent);
        }
        return true;
    }

    @Override // i.x, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C1284d c1284d = this.f18070f;
        c1284d.f18048d = charSequence;
        TextView textView = c1284d.f18062u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
