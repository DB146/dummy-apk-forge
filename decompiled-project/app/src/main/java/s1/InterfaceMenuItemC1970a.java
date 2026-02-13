package s1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import n.ActionProviderVisibilityListenerC1681o;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC1970a extends MenuItem {
    ActionProviderVisibilityListenerC1681o a();

    InterfaceMenuItemC1970a b(ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c10, int i7);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1970a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c10, int i7);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c10, char c11, int i7, int i10);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1970a setTooltipText(CharSequence charSequence);
}
