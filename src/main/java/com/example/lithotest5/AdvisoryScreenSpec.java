package com.example.lithotest5;

import android.graphics.Color;
import android.text.Layout;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.facebook.litho.Border;
import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.Row;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Image;
import com.facebook.litho.widget.Text;
import com.facebook.litho.widget.TextAlignment;
import com.facebook.litho.widget.VerticalGravity;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaJustify;

@LayoutSpec
public class AdvisoryScreenSpec {
    static final float LABEL_SIZE = 15f;
    static final int LABEL_COLOR = Color.LTGRAY;

    static final int DATA_COLOR = Color.WHITE;



    @OnCreateLayout
    static Component onCreateLayout(
            ComponentContext c,
            @Prop int timeToGreen,
            @Prop String advisoryAction,
            @Prop int currentSpeed,
            @Prop int distanceToSignal) {



        return Row.create(c)
                .backgroundColor(Color.BLACK)
                .child(
                        Column.create(c).child(
                                TrafficController.create(c)
                        ).alignItems(YogaAlign.CENTER)



                )

                .child(Column.create(c)
                        .child(Column.create(c) // Time to Green / Advisory Action
                                .border(
                                        Border.create(c)
                                                .color(YogaEdge.BOTTOM, Color.DKGRAY)
                                                .widthDip(YogaEdge.BOTTOM, 1)
                                                .build())
                                .justifyContent(YogaJustify.CENTER)
                                .alignItems(YogaAlign.CENTER)
                                .child(Row.create(c)
                                        .alignItems(YogaAlign.AUTO)
                                        .child(Text.create(c)
                                                .textSizeSp(80f)
                                                .text(Integer.toString(timeToGreen))
                                                .textColor(DATA_COLOR))
                                        .child(Text.create(c)
                                                .textSizeSp(40f)
                                                .text("s")
                                                .textColor(DATA_COLOR)))
                                .child(Text.create(c)
                                        .textSizeSp(LABEL_SIZE)
                                        .text("TIME TO GREEN")
                                        .textColor(LABEL_COLOR)
                                .paddingDip(YogaEdge.BOTTOM, 20))
                                .child(Text.create(c)
                                        .textSizeSp(30f)
                                        .text(advisoryAction)
                                        .textColor(DATA_COLOR))
                                .child(Text.create(c)
                                        .textSizeSp(LABEL_SIZE)
                                        .text("ADVISORY ACTION")
                                        .textColor(LABEL_COLOR))
                                .flexGrow(1))
                        .child(Row.create(c)
                                .child(Column.create(c) // Current Speed
                                        .justifyContent(YogaJustify.CENTER)
                                        .alignItems(YogaAlign.CENTER)
                                        .child(Row.create(c)
                                                .alignItems(YogaAlign.AUTO)
                                                .child(Text.create(c)
                                                        .textSizeSp(25f)
                                                        .text(Integer.toString(currentSpeed))
                                                        .textColor(DATA_COLOR))
                                                .child(Text.create(c)
                                                        .textSizeSp(12f)
                                                        .text("MPH")
                                                        .textColor(DATA_COLOR)))
                                        .child(Text.create(c)
                                                .textSizeSp(LABEL_SIZE)
                                                .text("CURRENT SPEED")
                                                .textColor(LABEL_COLOR))
                                        .flexGrow(1))
                                .child(Column.create(c) // Distance to Signal
                                        .border(
                                                Border.create(c)
                                                        .color(YogaEdge.LEFT, Color.DKGRAY)
                                                        .widthDip(YogaEdge.LEFT, 1)
                                                        .build())
                                        .justifyContent(YogaJustify.CENTER)
                                        .alignItems(YogaAlign.CENTER)
                                        .child(Row.create(c)
                                                .alignItems(YogaAlign.AUTO)
                                                .child(Text.create(c)
                                                        .textSizeSp(25f)
                                                        .text(Integer.toString(distanceToSignal))
                                                        .textColor(DATA_COLOR))
                                                .child(Text.create(c)
                                                        .textSizeSp(12f)
                                                        .text("M")
                                                        .textColor(DATA_COLOR)))
                                        .child(Text.create(c)
                                                .textSizeSp(LABEL_SIZE)
                                                .text("DISTANCE TO SIGNAL")
                                                .textColor(LABEL_COLOR))
                                        .flexGrow(1))
                                .flexGrow(1))
                        .flexGrow(3))
                .build();
    }
}
