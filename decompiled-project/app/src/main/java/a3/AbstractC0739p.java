package a3;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* renamed from: a3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0739p {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
