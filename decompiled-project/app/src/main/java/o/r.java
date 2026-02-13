package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f21579b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static r f21580c;

    /* renamed from: a, reason: collision with root package name */
    public F0 f21581a;

    public static synchronized r a() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f21580c == null) {
                    d();
                }
                rVar = f21580c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public static synchronized PorterDuffColorFilter c(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (r.class) {
            e2 = F0.e(i7, mode);
        }
        return e2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [o.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T6.a, java.lang.Object] */
    public static synchronized void d() {
        synchronized (r.class) {
            if (f21580c == null) {
                ?? obj = new Object();
                f21580c = obj;
                obj.f21581a = F0.b();
                F0 f02 = f21580c.f21581a;
                ?? obj2 = new Object();
                obj2.f9320a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                obj2.f9321b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                obj2.f9322c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                obj2.f9323d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                obj2.f9324e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                obj2.f9325f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (f02) {
                    f02.f21378e = obj2;
                }
            }
        }
    }

    public static void e(Drawable drawable, m4.O0 o02, int[] iArr) {
        PorterDuff.Mode mode = F0.f21372f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z8 = o02.f20119b;
        if (!z8 && !o02.f20118a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z8 ? (ColorStateList) o02.f20120c : null;
        PorterDuff.Mode mode2 = o02.f20118a ? (PorterDuff.Mode) o02.f20121d : F0.f21372f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = F0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i7) {
        return this.f21581a.c(context, i7);
    }
}
