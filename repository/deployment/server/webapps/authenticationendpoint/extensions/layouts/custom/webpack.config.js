const MiniCssExtractPlugin = require("mini-css-extract-plugin");
const CopyPlugin = require("copy-webpack-plugin");

module.exports = {
    entry: [
        __dirname + "/assets/scss/main.scss",
    ],
    module: {
        rules: [{
            test: /\.scss$/i,
            exclude: /node_modules/,
            use: [{
                    loader: "file-loader",
                    options: {
                        outputPath: "css/",
                        name: "styles.css"
                    },
                },
                "sass-loader",
            ],
        }, ],
    },
    plugins: [
        new MiniCssExtractPlugin({
            filename: "styles.css"
        }),
        new CopyPlugin({
            patterns: [{
                from:  __dirname + "/assets/fonts",
                to: __dirname + "/dist/fonts/"
            }],
        }),
    ],
};