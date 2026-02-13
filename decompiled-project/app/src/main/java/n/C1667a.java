package n;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import l1.AbstractC1449a;
import s1.InterfaceMenuItemC1970a;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1667a implements InterfaceMenuItemC1970a {

    /* renamed from: A, reason: collision with root package name */
    public PorterDuff.Mode f20881A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f20882B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f20883C;

    /* renamed from: D, reason: collision with root package name */
    public int f20884D;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f20885a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f20886b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f20887c;

    /* renamed from: d, reason: collision with root package name */
    public char f20888d;

    /* renamed from: e, reason: collision with root package name */
    public int f20889e;

    /* renamed from: f, reason: collision with root package name */
    public char f20890f;

    /* renamed from: u, reason: collision with root package name */
    public int f20891u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f20892v;

    /* renamed from: w, reason: collision with root package name */
    public Context f20893w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f20894x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f20895y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f20896z;

    @Override // s1.InterfaceMenuItemC1970a
    public final ActionProviderVisibilityListenerC1681o a() {
        return null;
    }

    @Override // s1.InterfaceMenuItemC1970a
    public final InterfaceMenuItemC1970a b(ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f20892v;
        if (drawable != null) {
            if (this.f20882B || this.f20883C) {
                this.f20892v = drawable;
                Drawable mutate = drawable.mutate();
                this.f20892v = mutate;
                if (this.f20882B) {
                    mutate.setTintList(this.f20896z);
                }
                if (this.f20883C) {
                    this.f20892v.setTintMode(this.f20881A);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f20891u;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f20890f;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f20894x;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f20892v;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f20896z;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f20881A;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f20887c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f20889e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f20888d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f20885a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f20886b;
        return charSequence != null ? charSequence : this.f20885a;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f20895y;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f20884D & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f20884D & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f20884D & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f20884D & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f20890f = Character.toLowerCase(c10);
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        this.f20890f = Character.toLowerCase(c10);
        this.f20891u = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z8) {
        this.f20884D = (z8 ? 1 : 0) | (this.f20884D & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z8) {
        this.f20884D = (z8 ? 2 : 0) | (this.f20884D & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f20894x = charSequence;
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final InterfaceMenuItemC1970a setContentDescription(CharSequence charSequence) {
        this.f20894x = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z8) {
        this.f20884D = (z8 ? 16 : 0) | (this.f20884D & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f20892v = AbstractC1449a.getDrawable(this.f20893w, i7);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f20892v = drawable;
        c();
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20896z = colorStateList;
        this.f20882B = true;
        c();
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f20881A = mode;
        this.f20883C = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f20887c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f20888d = c10;
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i7) {
        this.f20888d = c10;
        this.f20889e = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f20888d = c10;
        this.f20890f = Character.toLowerCase(c11);
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.f20888d = c10;
        this.f20889e = KeyEvent.normalizeMetaState(i7);
        this.f20890f = Character.toLowerCase(c11);
        this.f20891u = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        this.f20885a = this.f20893w.getResources().getString(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f20885a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f20886b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f20895y = charSequence;
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final InterfaceMenuItemC1970a setTooltipText(CharSequence charSequence) {
        this.f20895y = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z8) {
        this.f20884D = (this.f20884D & 8) | (z8 ? 0 : 8);
        return this;
    }
}
