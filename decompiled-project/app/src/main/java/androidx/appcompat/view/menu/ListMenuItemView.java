package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import h.AbstractC1213a;
import l2.X;
import n.C1680n;
import n.InterfaceC1691y;
import n.MenuC1678l;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1691y, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A, reason: collision with root package name */
    public boolean f12897A;

    /* renamed from: B, reason: collision with root package name */
    public final Drawable f12898B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f12899C;

    /* renamed from: D, reason: collision with root package name */
    public LayoutInflater f12900D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f12901E;

    /* renamed from: a, reason: collision with root package name */
    public C1680n f12902a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f12903b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f12904c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f12905d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f12906e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f12907f;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f12908u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f12909v;

    /* renamed from: w, reason: collision with root package name */
    public LinearLayout f12910w;

    /* renamed from: x, reason: collision with root package name */
    public final Drawable f12911x;

    /* renamed from: y, reason: collision with root package name */
    public final int f12912y;

    /* renamed from: z, reason: collision with root package name */
    public final Context f12913z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        X u3 = X.u(getContext(), attributeSet, AbstractC1213a.f17580r, R.attr.listMenuViewStyle);
        this.f12911x = u3.n(5);
        TypedArray typedArray = (TypedArray) u3.f19195c;
        this.f12912y = typedArray.getResourceId(1, -1);
        this.f12897A = typedArray.getBoolean(7, false);
        this.f12913z = context;
        this.f12898B = u3.n(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f12899C = obtainStyledAttributes.hasValue(0);
        u3.w();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f12900D == null) {
            this.f12900D = LayoutInflater.from(getContext());
        }
        return this.f12900D;
    }

    private void setSubMenuArrowVisible(boolean z8) {
        ImageView imageView = this.f12908u;
        if (imageView != null) {
            imageView.setVisibility(z8 ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // n.InterfaceC1691y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C1680n c1680n) {
        boolean z8;
        String sb2;
        boolean z10;
        this.f12902a = c1680n;
        int i7 = 0;
        setVisibility(c1680n.isVisible() ? 0 : 8);
        setTitle(c1680n.f20989e);
        setCheckable(c1680n.isCheckable());
        if (c1680n.f20970B.o()) {
            if ((c1680n.f20970B.n() ? c1680n.f20994x : c1680n.f20992v) != 0) {
                z8 = true;
                c1680n.f20970B.n();
                if (z8) {
                    C1680n c1680n2 = this.f12902a;
                    if (c1680n2.f20970B.o()) {
                        if ((c1680n2.f20970B.n() ? c1680n2.f20994x : c1680n2.f20992v) != 0) {
                            z10 = true;
                        }
                    }
                    z10 = false;
                }
                i7 = 8;
                if (i7 == 0) {
                    TextView textView = this.f12907f;
                    C1680n c1680n3 = this.f12902a;
                    char c10 = c1680n3.f20970B.n() ? c1680n3.f20994x : c1680n3.f20992v;
                    if (c10 == 0) {
                        sb2 = "";
                    } else {
                        MenuC1678l menuC1678l = c1680n3.f20970B;
                        Resources resources = menuC1678l.f20954a.getResources();
                        StringBuilder sb3 = new StringBuilder();
                        if (ViewConfiguration.get(menuC1678l.f20954a).hasPermanentMenuKey()) {
                            sb3.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i10 = menuC1678l.n() ? c1680n3.f20995y : c1680n3.f20993w;
                        C1680n.c(i10, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb3);
                        C1680n.c(i10, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb3);
                        C1680n.c(i10, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb3);
                        C1680n.c(i10, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb3);
                        C1680n.c(i10, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb3);
                        C1680n.c(i10, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb3);
                        if (c10 == '\b') {
                            sb3.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c10 == '\n') {
                            sb3.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c10 != ' ') {
                            sb3.append(c10);
                        } else {
                            sb3.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb2 = sb3.toString();
                    }
                    textView.setText(sb2);
                }
                if (this.f12907f.getVisibility() != i7) {
                    this.f12907f.setVisibility(i7);
                }
                setIcon(c1680n.getIcon());
                setEnabled(c1680n.isEnabled());
                setSubMenuArrowVisible(c1680n.hasSubMenu());
                setContentDescription(c1680n.f20973E);
            }
        }
        z8 = false;
        c1680n.f20970B.n();
        if (z8) {
        }
        i7 = 8;
        if (i7 == 0) {
        }
        if (this.f12907f.getVisibility() != i7) {
        }
        setIcon(c1680n.getIcon());
        setEnabled(c1680n.isEnabled());
        setSubMenuArrowVisible(c1680n.hasSubMenu());
        setContentDescription(c1680n.f20973E);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f12909v;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12909v.getLayoutParams();
        rect.top = this.f12909v.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // n.InterfaceC1691y
    public C1680n getItemData() {
        return this.f12902a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f12911x);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f12905d = textView;
        int i7 = this.f12912y;
        if (i7 != -1) {
            textView.setTextAppearance(this.f12913z, i7);
        }
        this.f12907f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f12908u = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f12898B);
        }
        this.f12909v = (ImageView) findViewById(R.id.group_divider);
        this.f12910w = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.f12903b != null && this.f12897A) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f12903b.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i7, i10);
    }

    public void setCheckable(boolean z8) {
        CompoundButton compoundButton;
        View view;
        if (!z8 && this.f12904c == null && this.f12906e == null) {
            return;
        }
        if ((this.f12902a.L & 4) != 0) {
            if (this.f12904c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f12904c = radioButton;
                LinearLayout linearLayout = this.f12910w;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f12904c;
            view = this.f12906e;
        } else {
            if (this.f12906e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f12906e = checkBox;
                LinearLayout linearLayout2 = this.f12910w;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f12906e;
            view = this.f12904c;
        }
        if (z8) {
            compoundButton.setChecked(this.f12902a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f12906e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f12904c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z8) {
        CompoundButton compoundButton;
        if ((this.f12902a.L & 4) != 0) {
            if (this.f12904c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f12904c = radioButton;
                LinearLayout linearLayout = this.f12910w;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f12904c;
        } else {
            if (this.f12906e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f12906e = checkBox;
                LinearLayout linearLayout2 = this.f12910w;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f12906e;
        }
        compoundButton.setChecked(z8);
    }

    public void setForceShowIcon(boolean z8) {
        this.f12901E = z8;
        this.f12897A = z8;
    }

    public void setGroupDividerEnabled(boolean z8) {
        ImageView imageView = this.f12909v;
        if (imageView != null) {
            imageView.setVisibility((this.f12899C || !z8) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f12902a.f20970B.getClass();
        boolean z8 = this.f12901E;
        if (z8 || this.f12897A) {
            ImageView imageView = this.f12903b;
            if (imageView == null && drawable == null && !this.f12897A) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f12903b = imageView2;
                LinearLayout linearLayout = this.f12910w;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f12897A) {
                this.f12903b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f12903b;
            if (!z8) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f12903b.getVisibility() != 0) {
                this.f12903b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f12905d.getVisibility() != 8) {
                this.f12905d.setVisibility(8);
            }
        } else {
            this.f12905d.setText(charSequence);
            if (this.f12905d.getVisibility() != 0) {
                this.f12905d.setVisibility(0);
            }
        }
    }
}
