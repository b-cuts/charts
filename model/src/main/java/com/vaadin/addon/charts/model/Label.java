package com.vaadin.addon.charts.model;
/**
 * Text labels for the plot bands
 */
public class Label extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private HorizontalAlign align;
	private Number rotation;
	private Object style;
	private String text;
	private String textAlign;
	private Boolean useHTML;
	private VerticalAlign verticalAlign;
	private Number x;
	private Number y;

	public Label() {
	}

	/**
	 * @see #setAlign(HorizontalAlign)
	 */
	public HorizontalAlign getAlign() {
		return align;
	}

	/**
	 * Horizontal alignment of the label. Can be one of "left", "center" or
	 * "right".
	 * <p>
	 * Defaults to: left
	 */
	public void setAlign(HorizontalAlign align) {
		this.align = align;
	}

	/**
	 * @see #setRotation(Number)
	 */
	public Number getRotation() {
		return rotation;
	}

	/**
	 * Rotation of the text label in degrees. Defaults to 0 for horizontal plot
	 * lines and 90 for vertical lines.
	 */
	public void setRotation(Number rotation) {
		this.rotation = rotation;
	}

	/**
	 * @see #setStyle(Object)
	 */
	public Object getStyle() {
		return style;
	}

	/**
	 * CSS styles for the text label.
	 */
	public void setStyle(Object style) {
		this.style = style;
	}

	public Label(String text) {
		this.text = text;
	}

	/**
	 * @see #setText(String)
	 */
	public String getText() {
		return text;
	}

	/**
	 * The text itself. A subset of HTML is supported.
	 * <p>
	 * Defaults to:
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @see #setTextAlign(String)
	 */
	public String getTextAlign() {
		return textAlign;
	}

	/**
	 * The text alignment for the label. While <code>align</code> determines
	 * where the texts anchor point is placed within the plot band,
	 * <code>textAlign</code> determines how the text is aligned against its
	 * anchor point. Possible values are "left", "center" and "right". Defaults
	 * to the same as the <code>align</code> option.
	 */
	public void setTextAlign(String textAlign) {
		this.textAlign = textAlign;
	}

	/**
	 * @see #setUseHTML(Boolean)
	 */
	public Boolean getUseHTML() {
		return useHTML;
	}

	/**
	 * <p>
	 * Whether to <a href="http://docs.highcharts.com/#formatting$html">use
	 * HTML</a> to render the labels.
	 * <p>
	 * Defaults to: false
	 */
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
	}

	/**
	 * @see #setVerticalAlign(VerticalAlign)
	 */
	public VerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * Vertical alignment of the label relative to the plot band. Can be one of
	 * "top", "middle" or "bottom".
	 * <p>
	 * Defaults to: top
	 */
	public void setVerticalAlign(VerticalAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * Horizontal position relative the alignment. Default varies by
	 * orientation.
	 */
	public void setX(Number x) {
		this.x = x;
	}

	/**
	 * @see #setY(Number)
	 */
	public Number getY() {
		return y;
	}

	/**
	 * Vertical position of the text baseline relative to the alignment. Default
	 * varies by orientation.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}